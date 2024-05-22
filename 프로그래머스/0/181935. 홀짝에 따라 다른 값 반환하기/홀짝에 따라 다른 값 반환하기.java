class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = n; i >= 0; i -= 2) {
            answer += (n%2 == 0) ? (i*i) : i;
        }
        return answer;
    }
}

//  감소식 반복문은 n으로 시작하므로 시작점이 홀수/짝수인지 판단가능. 더 간단하게 수식을 짤 수 있다.