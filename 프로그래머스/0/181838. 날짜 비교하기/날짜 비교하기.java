class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        for(int i = 0; i < date1.length; i++) {
            if(date1[i] > date2[i]) break;
            if(date1[i] < date2[i]) return answer = 1;
            if(date1[i] == date2[i]) {
                continue;
            }
        }
        return answer;
    }
}