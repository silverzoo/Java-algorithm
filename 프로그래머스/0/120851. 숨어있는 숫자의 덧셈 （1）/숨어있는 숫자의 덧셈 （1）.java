class Solution {
    public int solution(String my_string) {
        int answer = 0;
        //문자열 -> 문자형 변환후, 아스키코드로 범위 지정
        for(char c : my_string.toCharArray()) {
            if('1' <= c && c <= '9') answer += c-'0';
        }
        return answer;
    }
}