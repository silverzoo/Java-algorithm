class Solution {
    public int solution(int[] sides) {
        int longest = sides[0];
        int rest = 0;
        //가장 긴변 구하기
        for(int i = 1; i < 3; i++) {
            if(longest < sides[i]) {
                rest += longest;
                longest = sides[i];
            } else rest += sides[i];
        }
        //삼각형의 완성조건 판단하기
        if(longest < rest) return 1;
        else return 2;
    }
}