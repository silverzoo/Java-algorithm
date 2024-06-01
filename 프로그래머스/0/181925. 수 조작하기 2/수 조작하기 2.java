class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for(int i = 1; i < numLog.length; i++) {
            int minus = numLog[i] - numLog[i-1];
            answer += switch(minus) {
                    case 1 -> "w";
                    case -1 -> "s";
                    case 10 -> "d";
                    case -10 -> "a";
                    default -> "";
            };
        }
        return answer;
    }
}