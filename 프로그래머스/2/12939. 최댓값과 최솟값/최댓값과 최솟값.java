class Solution {
    public String solution(String s) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(String str : s.split(" ")) {
            max = Math.max(max, Integer.parseInt(str));
            min = Math.min(min, Integer.parseInt(str));
        }
        return "" + min + " " + max;
    }
}