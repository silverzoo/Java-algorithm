class Solution {
    public String solution(String my_string, String alp) {
        String bigAlp = alp.toUpperCase();
        
        return my_string.replaceAll(alp, bigAlp);
    }
}