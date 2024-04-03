class Solution {
    public String solution(String rsp) {
        return win(rsp);
    }
    
    public String win(String rsp) {
        String[] rspArr = rsp.split("");
        String answer = "";
        for(int i = 0; i < rspArr.length; i++) {
            if (rspArr[i].equals("2")) answer += "0";
            else if (rspArr[i].equals("0")) answer += "5";
            else if (rspArr[i].equals("5")) answer += "2";
        }
        return answer;
        
    }
}