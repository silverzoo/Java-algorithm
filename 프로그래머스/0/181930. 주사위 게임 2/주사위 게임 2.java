class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(a == b && b == c) {
            answer = (int)(Math.pow(a,6) * 27) ;
        } else if(a != b && b != c && a != c) {
            answer = a + b + c;
        } else {
            answer = (int)(Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2)) * (a + b + c);
        }
        return answer;
    }
}