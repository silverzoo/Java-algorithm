class Solution {
    public int solution(int[] numbers) {
        int max = numbers[0] * numbers[1];
        for(int i = 0; i < numbers.length; i++) {
            int factor1 = numbers[i];
            for(int j = i+1; j < numbers.length; j++) {
                int factor2 = numbers[j];
                if(max < factor1 * factor2) max = factor1 * factor2;
            }
        }
        return max;
    }
}