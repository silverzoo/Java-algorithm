class Solution {
    public int solution(int[] arr, int idx) {
        int answer = -1;
        
        //문제 오류 : "idx보다 크거나 같은" 이라는 전제여야 함
        for(int i = idx; i < arr.length; i++) {
            if(arr[i] == 1) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}