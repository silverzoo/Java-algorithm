class Solution {
    public int solution(int n) {
        int answer = (n%7==0) ? n/7 : n/7 + 1;

        return answer;
    }
}

//더 간단한 코드.
//7인 미만은 어차피 나눠도 몫이 0이라서 한번더 if문으로 체크할 필요x