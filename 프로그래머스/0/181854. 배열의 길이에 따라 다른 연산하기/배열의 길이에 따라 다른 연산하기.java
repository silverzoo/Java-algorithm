class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            if(arr.length % 2 != 0) {
                answer[i] = (i % 2 == 0)? arr[i]+n : arr[i];
            } else {
                answer[i] = (i % 2 != 0)? arr[i]+n : arr[i];
            }
        }
        return answer;
    }
}