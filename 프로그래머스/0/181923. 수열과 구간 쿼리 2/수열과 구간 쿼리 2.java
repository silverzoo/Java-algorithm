class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int cnt = 0; cnt < queries.length; cnt++) {
            int[] queiry = queries[cnt];
            int min = Integer.MAX_VALUE;
            int s = queiry[0], e = queiry[1], k = queiry[2];
            
            for(int i = s; i <= e; i++) {
                if(arr[i] > k) {
                    min = Math.min(arr[i], min);
                }
            }
            
            answer[cnt] = (min == Integer.MAX_VALUE)? -1 : min;
        }
        
        return answer;
    }
}

//배열의 인덱스 증가를 위한 코드를 써야한다면 향상된for문보다 일반for문을 써서 인덱스로 활용하는 게 나은 것 같다.