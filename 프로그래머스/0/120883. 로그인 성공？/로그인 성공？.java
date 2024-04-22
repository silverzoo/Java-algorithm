class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";

        for(String[] i : db) {
            if(i[0].equals(id_pw[0])) {
                if(i[1].equals(id_pw[1])) {
                    answer = "login";
                    break;
                } else {
                    answer = "wrong pw";
                    break;
                }
            } else answer = "fail";
        }
        
        return answer;
    }
}