class Solution {
    public int solution(int a, int b, int c) {
        int answer = 1;
        int cnt = 1;
        
        if(a == b || a == c || b == c) cnt++;
        if(a == b && a == c) cnt++;
        
        for(int i = 1; i <= cnt; i++) {
            answer *= (int)(Math.pow(a,i) + Math.pow(b,i) + Math.pow(c,i));
        }
        return answer;
    }
}
//문제 조건의 유사한 부분을 캐치하고 효율적인 방법의 코드를 짜보기