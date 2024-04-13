class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int a : array) {
            while(a > 0) {
                if(a%10 == 7) answer++;
                a /= 10;
            }
        }
        return answer;
    }
}
//원래 하고 싶었던 로직. 1.향상된 for문 2.배열 요소가 int형일 때 자리수별로 비교