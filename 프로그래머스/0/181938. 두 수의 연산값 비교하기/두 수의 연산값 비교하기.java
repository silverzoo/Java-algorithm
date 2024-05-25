class Solution {
    public int solution(int a, int b) {
        int sum = Integer.parseInt(""+a+b);
        int mul = 2 * a * b;
        return (sum >= mul)? sum : mul;
    }
}