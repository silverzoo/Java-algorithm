class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        
        while((slice*answer)/n == 0) {
            answer++;
        }
        
        return answer;
    }
}