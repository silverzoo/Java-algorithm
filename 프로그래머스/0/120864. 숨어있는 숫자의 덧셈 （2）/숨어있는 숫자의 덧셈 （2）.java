class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.replaceAll("[^0-9]"," ").split(" ");
        
        for(String s : str) {
            answer += (s.isEmpty()) ? 0 : Integer.parseInt(s);
        }
        return answer;
    }
}
//오류: 자연수라고해서 정규식의 범위를 [^1-9]로 했는데 일부 케이스 테스트실패.
//해결: 두자리수이상일 경우 (10,200..)를 고려하여 [^0-9]로 변경해야한다.