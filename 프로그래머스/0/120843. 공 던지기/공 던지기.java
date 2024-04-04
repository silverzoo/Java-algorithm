class Solution {
    public int solution(int[] numbers, int k) {
        int index = 0;
        
        for(int i = 1; i < k; i ++) {
            index += 2;
        }
        
        index %= numbers.length;
        
        return numbers[index];
    }
}