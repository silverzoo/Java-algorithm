import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2+1);
    }
} // Arrays.copyOfRange(원본배열,시작,마지막+1): 특정 배열의 범위만큼 복사하여 새로운 배열을 만드는 메서드.