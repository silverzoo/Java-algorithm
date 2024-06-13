class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int length = my_string.length();
        return my_string.substring(length-n);
    }
}