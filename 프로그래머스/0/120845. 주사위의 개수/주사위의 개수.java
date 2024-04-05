class Solution {
    public int solution(int[] box, int n) {
        int[] answer = new int[3];
        
        for(int i = 0; i < box.length; i++) {
            answer[i] = box[i]/n;
        }
        
        return answer[0] * answer[1] * answer[2];
    }
}