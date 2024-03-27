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

/* 분자와 분모의 최대공약수를 내림차순 반복문으로 찾는 방식
class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int mother = num1 * num2;
        int son1 = num1 * denum2;
        int son2 = num2 * denum1;
        int totalSon = son1 + son2;
        for(int i = mother; i >= 1; i--){
            if(totalSon % i == 0 && mother % i == 0){
                totalSon /= i;
                mother /= i;
            }
        }
        int[] answer = {totalSon, mother};
        return answer;
    }
}
*/
