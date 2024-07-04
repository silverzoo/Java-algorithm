class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int length = (intervals[0][1]-intervals[0][0])+(intervals[1][1]-intervals[1][0])+2;
        int[] answer = new int[length];
        int idx = 0;
        
        for(int[] i : intervals) {
            for(int j = i[0]; j <= i[1]; j++) {
                answer[idx++] = arr[j];
            }
        }
        return answer;
    }
}