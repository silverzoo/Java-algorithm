class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num-end_num+1];
        int idx = 0;
        
        for(int i = start_num; i >= end_num; i--) {
            answer[idx++] = i;
        }
        
        return answer;
    }
}