class Solution {
    public int solution(String before, String after) {
        int cnt = 0;
        for(String a : after.split("")) {
            if(before.contains(a)) cnt++;
            before = before.replaceFirst(a,"");
        }
        
        return (cnt == after.length()) ? 1 : 0;
    }
}