import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = new int[numlist.length];
        int index = 0;
        
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i]%n == 0) {
                answer[index] = numlist[i];
                index++;
            }
        }
        
        int[] realAnswer = Arrays.copyOf(answer, index);
        return realAnswer;
    }
}