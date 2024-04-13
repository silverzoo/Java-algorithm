class Solution {
    public String[] solution(String my_str, int n) {
        
        String[] answer = my_str.split("(?<=\\G.{" + n + "})");
        return answer;
    }
}
//String.split()은 특정 문자열 외에도 정규표현식으로 특정 길이만큼 자를 수 있다.