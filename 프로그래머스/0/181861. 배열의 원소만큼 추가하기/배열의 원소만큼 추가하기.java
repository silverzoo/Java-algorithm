class Solution {
    public int[] solution(int[] arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        
        int[] answer = new int[sum];
        int idx = 0;
        for(int j : arr) {
            for(int k = 0; k < j; k++) {
                answer[idx++] = j;
            }
        }
        
        return answer;
    }
}