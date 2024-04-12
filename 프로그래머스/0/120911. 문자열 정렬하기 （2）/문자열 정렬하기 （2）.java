import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase();
        char[] arr = answer.toCharArray();
        Arrays.sort(arr);

        return new String(arr);
    }
}