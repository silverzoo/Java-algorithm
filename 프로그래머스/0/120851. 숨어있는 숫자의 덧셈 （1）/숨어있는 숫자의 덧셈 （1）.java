class Solution {
    public int solution(String my_string) {
        //자연수로만 구성되어 있는 문자열 초기화
        String myNum = my_string.replaceAll("[^1-9]","");
        //숫자배열 선언
        int[] numArr = new int[myNum.length()];
        //문자열 -> 정수형 + 자연수들의 합 구하기
        int answer = 0;
        for(int i = 0; i < numArr.length; i++) {
            numArr[i] = myNum.charAt(i)-'0';
            answer += numArr[i];
        }
        return answer;
    }
}