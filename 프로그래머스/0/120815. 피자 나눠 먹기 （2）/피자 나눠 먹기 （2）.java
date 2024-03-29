class Solution {
    public int solution(int n) {
        int answer = 1;
        
        //몫이 남느냐 안남느냐로 피자 수가 충분한지 체크하는 방식.
        while((answer*6)%n != 0) {
            answer++;
        }
        return answer;
    }
}