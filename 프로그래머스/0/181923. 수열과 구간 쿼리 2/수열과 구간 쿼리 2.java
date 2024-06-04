class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int cnt = 0;
        
        for(int[] queiry : queries) {
            int min = Integer.MAX_VALUE;
            int s = queiry[0];
            int e = queiry[1];
            int k = queiry[2];
            
            for(int i = s; i <= e; i++) {
                if(arr[i] > k && arr[i] < min) {
                    min = arr[i];
                }
            }
            
            if(min == Integer.MAX_VALUE) {
                min = -1;
            }
            
            answer[cnt] = min;
            cnt++;
        }
        
        return answer;
    }
}