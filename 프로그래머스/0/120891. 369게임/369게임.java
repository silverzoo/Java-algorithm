class Solution {
    public int solution(int order) {
        String str = Integer.toString(order);
        String[] strArr = str.split("");
        int cnt = 0;
        
        for(int i = 0; i < strArr.length; i++) {
            if(strArr[i].equals("3") || strArr[i].equals("6") || strArr[i].equals("9")) 
                cnt++;
        }
        return cnt;
    }
}