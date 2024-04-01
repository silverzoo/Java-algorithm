class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        int start = 0;
        
        for(int i = num1; i <= num2; i++) {
            answer[start++] += numbers[i];
        }
        return answer;
    }
}