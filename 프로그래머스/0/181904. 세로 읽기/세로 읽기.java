class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        while(c <= my_string.length()) {
            answer += my_string.substring(c-1,c);
            c += m;
        }
        
        return answer;
    }
}