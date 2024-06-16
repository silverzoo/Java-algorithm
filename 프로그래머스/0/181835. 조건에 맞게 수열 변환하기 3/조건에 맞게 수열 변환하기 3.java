class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = (k % 2 == 0)? arr[i]+k : arr[i]*k;
        }
        
        return answer;
    }
}