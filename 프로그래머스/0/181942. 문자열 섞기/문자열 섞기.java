class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        for(int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
            //answer += str1.charAt(i) + str2.charAt(i); 은 정수형계산으로 된다.
            //대신, answer += "" + str1.charAt(i) + str2.charAt(i); 로 문자열계산을 먼저 하게 해주면 해결됨.
        }
        
        return answer;
    }
}