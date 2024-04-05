class Solution {
    public int solution(int[] numbers) {
        int max = numbers[0];
        int prevMax = 0;
        
        for(int i = 1; i < numbers.length; i++) {
            if(max < numbers[i]) {
                prevMax = max;
                max = numbers[i];
            } else if(prevMax < numbers[i]) {
                prevMax = numbers[i];
            }
        }
        return max * prevMax;
    }
} //정석대로 풀어보기.
