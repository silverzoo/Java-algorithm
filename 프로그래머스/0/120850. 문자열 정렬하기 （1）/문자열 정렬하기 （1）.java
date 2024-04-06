import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String myNum = my_string.replaceAll("[^0-9]","");
        String[] numArr = myNum.split("");
        Arrays.sort(numArr);
        int[] answer = new int[numArr.length];
        
        for(int i = 0; i < numArr.length; i++) {
            answer[i] = Integer.parseInt(numArr[i]);
        }
        
        return answer;
    }
}