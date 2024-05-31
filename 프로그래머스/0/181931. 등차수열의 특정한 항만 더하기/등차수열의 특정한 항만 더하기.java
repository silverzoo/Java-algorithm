class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(boolean on : included) {
            if(on == true) {
                answer += a;
            }
            a += d;
        }
        return answer;
    }
}