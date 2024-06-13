class Solution {
    public int solution(String my_string, String is_suffix) {
        
        return (my_string.endsWith(is_suffix))? 1 : 0;
    }
}

//startsWith(String s,int n) -> 특정 문자열이 접두사인지 확인
//endsWith(String s,int n) -> 특정 문자열이 접미사인지 확인
//두번째 매개변수의 유무로 시작인덱스를 지정할 수 있다