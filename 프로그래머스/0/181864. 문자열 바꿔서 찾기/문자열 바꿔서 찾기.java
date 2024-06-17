class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replace("A","a").replace("B","A").replace("a","B");
        
        return (myString.contains(pat))? 1 : 0;
    }
} // String클래스의 replace함수를 기억하자