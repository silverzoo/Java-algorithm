class Solution {
    public int solution(int n) {
        //n과 6의 최소공배수 = 필요한 피자조각수
        int lcm = getLcm(n,6);
        int answer = lcm/6;
        return answer;
    }
    
    //최소공배수 구하기
    public int getLcm(int a, int b) {
        return (a*b) / getGcd(a,b);
    }
    
    //최대공약수 구하기
    public int getGcd(int a, int b) {
        if(b==0) return a;
        return getGcd(b, (a%b));
    }
}