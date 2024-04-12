class Solution {
    public int solution(int n) {
        double sqrt = Math.sqrt(n);
        //소수점값이 없으면 정수인 제곱근, 있으면 정수가 아닌 제곱근이다.
        return (sqrt%1 == 0.0) ? 1 : 2;
    }
}