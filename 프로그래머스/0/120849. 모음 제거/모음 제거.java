class Solution {
    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]","");
    }
} 
//replace함수도 있지만 replaceAll을 쓰면 정규식 사용이 가능하다.
//[aeiou]는 정규식. []안의 범위 중 한 문자만을 선택한다.