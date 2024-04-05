class Solution {
    public int solution(int n) {
        int answer = 0;
        
        //최대 팩토리얼은 10
        for(int i = 1; i <= 10; i++) {
            if(n >= factorial(i)) answer = i;
            else break;
        }
        return answer;
    }
    
    public static int factorial(int n) {
        if (n > 1) return n * factorial(n-1);
        return n;
    }
}