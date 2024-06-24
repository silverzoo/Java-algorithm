class Solution {
    public int[] solution(String myString) {
        String[] newString = myString.split("x");
        int length = (myString.endsWith("x"))? newString.length + 1 : newString.length;
        int[] answer = new int[length];
        int idx = 0;
        
        for(String str : newString) {
            answer[idx++] = str.length();
        }

        return answer;
    }
}