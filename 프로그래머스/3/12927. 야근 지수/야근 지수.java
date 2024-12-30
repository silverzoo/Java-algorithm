import java.util.Arrays;

class Solution {
    public long solution(int n, int[] works) {
        long result = 0;
        int m = works.length - 1;

        // 가장 큰 작업부터 줄이기
        Arrays.sort(works);

        while (n > 0) {
            insertionSort(works, m);  
            works[m]--;
            n--;
        }

        // 남은 작업량 제곱의 합을 계산
        for (int i = 0; i < works.length; i++) {
            if (works[i] > 0) {
                result += works[i] * works[i];
            }
        }

        return result;
    }
    
    // 삽입정렬로 바뀐 요소만 재정렬
    public static void insertionSort(int[] works, int m) {
        
        if (m == 0) {
            return;
        }

        // 배열을 내림차순으로 정렬하여 가장 큰 작업량을 끝으로 이동
        for (int i = m; i >= 0; i--) {
            boolean isSorted = false;
            int target = works[i];
            int j = i - 1;
            while (j >= 0 && target < works[j]) {
                works[j + 1] = works[j];
                j--;
                isSorted = true;
            }
            works[j + 1] = target;
            if (!isSorted) {
                break;
            }
        }
    }
}

// 목표는 제곱의 합을 최소화하는 것. 그러기 위해 가장 큰 요소를 중심으로 작업량을 줄여야 함.
