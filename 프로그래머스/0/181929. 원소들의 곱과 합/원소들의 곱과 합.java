class Solution {
    public int solution(int[] num_list) {
        int mul = 1;
        int sum = 0;
        int square = 1;
        
        for(int num : num_list) {
            mul *= num;
            sum += num;
        }
        square = sum*sum;
        
        return (mul < square)? 1: 0;
    }
}