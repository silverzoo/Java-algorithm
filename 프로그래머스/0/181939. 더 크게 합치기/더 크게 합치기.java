class Solution {
    public int solution(int a, int b) {
        //""+ 과의 연산으로 쉽게 toString() 하기.
        int first = Integer.parseInt(""+a+b);
        int second = Integer.parseInt(""+b+a);
        return (first >= second) ? first : second;
    }
}