class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i = 0; i < array.length; i++) {
            String str = array[i]+"";
            for(int j = 0; j < str.length(); j++) {
                if('7' == str.charAt(j)) answer++;
            }
        }
        return answer;
    }
}