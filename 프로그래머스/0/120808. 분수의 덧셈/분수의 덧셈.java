class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        // 통분하지 않은 분수
        int numer = (numer1 * denom2) + (numer2 * denom1); 
        int denom = denom1 * denom2;
        
        // 최대공약수로 나누어 기약분수 만들기
		int gcd = getGcd(numer, denom);
        numer = numer/gcd;
        denom = denom/gcd;
	
        int[] answer = { numer, denom };
        return answer;
    }
    
    // 최대공약수 구하기
	public static int getGcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		return getGcd(b, a%b);
	}
}