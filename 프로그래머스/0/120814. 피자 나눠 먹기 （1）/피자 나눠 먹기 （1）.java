class Solution {
    public int solution(int n) {
        int answer = 0;
        int val = n%7;
        
        //n%7이  0이면 -> n/7개
        //n%7이 !0이면 -> 1개 이거나 n/7+1개이거나

        if(val == 0) {
            answer = n/7;
        } else if(val != 0) {
            if(n<7) answer = 1;
            answer = n/7 + 1;
        }
        return answer;
    }
}