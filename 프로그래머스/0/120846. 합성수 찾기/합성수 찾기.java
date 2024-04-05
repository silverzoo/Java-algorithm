class Solution {
    public int solution(int n) {
        int answer = 0; //합성수의 개수
        
        for (int i = 2; i <= n; i++) {
            int cnt = 1; //약수의 개수. 자연수 1은 생략
            for (int j = 2; j <= n; j++) 
                cnt += (i%j == 0) ? 1 : 0;
            answer += (cnt >= 3) ? 1 : 0;
        }
        return answer;
    }
}