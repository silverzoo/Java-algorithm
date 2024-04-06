import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        //숫자만 있는 문자열로 초기화
        String myNum = my_string.replaceAll("[a-z]","");
        //숫자배열 선언
        int[] answer = new int[myNum.length()];
        //숫자배열에 문자열->정수형으로 숫자 대입
        for(int i = 0; i < answer.length; i++) {
            answer[i] = myNum.charAt(i)-'0';
        }
        //숫자배열 오름차순 정렬
        Arrays.sort(answer);
        
        return answer;
    }
} //같은 알고리즘이지만 더 정리된 순서로 재작성함.