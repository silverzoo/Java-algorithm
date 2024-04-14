import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        int potential1 = numbers[0] * numbers[1]; //음수끼리 곱해서 최대값이 나올 가능성변수.
        int potential2 = numbers[numbers.length-1] * numbers[numbers.length-2];
        return Math.max(potential1, potential2);
    }
}
//오름차순 정렬를 활용해서 간단한 로직을 구현하고 싶었는데 음수끼리의 곱을 처리할 아이디어가 떠오르지 않았다.
//가장 작은 요소 둘의 곱과 가장 큰 요소 둘의 곱을 비교만 하면 된다.