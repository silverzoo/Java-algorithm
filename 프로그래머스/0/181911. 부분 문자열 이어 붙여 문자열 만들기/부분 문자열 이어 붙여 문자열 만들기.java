class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        int idx = 0;
        for(String str : my_strings) {
            answer += str.substring(parts[idx][0],parts[idx][1]+1);
            idx++;
        }
        return answer;
    }
}