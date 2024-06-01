class Solution {
    public String solution(int[] numLog) {
        StringBuffer answer = new StringBuffer();
        
        for(int i = numLog.length-1; i >= 1; i--) {
            int minus = numLog[i] - numLog[i-1];
            if(minus == 1) answer.append("w");
            else if(minus == -1) answer.append("s");
            else if(minus == 10) answer.append("d");
            else if(minus == -10) answer.append("a");
        }
        return answer.reverse().toString();
    }
}