class Solution {
    public String[] solution(String my_string) {
        
        return my_string.trim().split(" +");
    }
}

//String클래스의 trim()함수는 문자열 양끝의 공백을 제거해준다. 가운데 공백은 제거해주지 않는다.