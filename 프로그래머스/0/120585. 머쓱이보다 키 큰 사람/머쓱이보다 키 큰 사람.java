import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        Arrays.sort(array);
        int answer = 0;
        
        for(int i = 0; i < array.length; i++) {
            if(height < array[i]) answer++;
        }
        return answer;
    }
}