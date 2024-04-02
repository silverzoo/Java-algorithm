class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = n;
        
        //n의 공약수 개수 출력하기
        while(num > 0) {
            if(n%num == 0) answer++;
            num--;
        }
        return answer;
    }
}