class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        
        for(int i = num_list.length-1, j = 0; i >= 0; i--, j++) {
            answer[i] = num_list[j];
        }
        
        return answer;
    }
}