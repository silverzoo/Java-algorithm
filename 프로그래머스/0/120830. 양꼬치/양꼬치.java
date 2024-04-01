class Solution {
    public int solution(int n, int k) {
        int answer = 12000*n + 2000*k;
        int freeCnt = 0;
        if((10 <= n && n%10 != 0) || n%10 == 0) {
            freeCnt = n/10;
            answer -= 2000*freeCnt;
        }
        return answer;
    }
}