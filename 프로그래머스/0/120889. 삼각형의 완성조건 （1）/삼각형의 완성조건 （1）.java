import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[2] < sides[0]+sides[1] ? 1 : 2;
    }
} //Arrays.sort() 오름차순 정렬로 쉽게 풀 수 있다