class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if(65 <= c && c <= 90) c += 32;
            else if(97 <= c && c <= 122) c -= 32;
            answer += c;
        }
        return answer;
    }
}
//A 에서 Z : 65~90
//a 에서 z : 97~122