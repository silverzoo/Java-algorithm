import java.util.Arrays;

class Solution {
    public int solution(int[] date1, int[] date2) {
        return Arrays.compare(date1, date2) < 0 ? 1 : 0;
    }
}
//Arrays.compare(int[] a, int[] b)
//a < b 이면 양의 정수 반환 a == b 이면 0, a > b 이면 음의 정수 반환