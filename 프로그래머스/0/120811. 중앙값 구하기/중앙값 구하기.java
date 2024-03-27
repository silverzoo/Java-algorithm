import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        //주어진 배열 오름차순으로 정렬하기
        Arrays.sort(array);

        int length = array.length;
        int answer = 0;
        answer = length / 2;
        
        return array[answer];
    }
}