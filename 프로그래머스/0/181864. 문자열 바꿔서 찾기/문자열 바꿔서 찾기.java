class Solution {
    public int solution(String myString, String pat) {
        StringBuilder newString = new StringBuilder();
        
        for(String str : myString.split("")) {
            if(str.equals("A")) {
                newString.append("B");
            } else {
                newString.append("A");
            }
        }
        
        return (newString.toString().contains(pat))? 1 : 0;
    }
}