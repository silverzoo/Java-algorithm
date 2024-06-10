import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i = 0, j = B.length-1; i < A.length; i++, j--) {
            answer += A[i] * B[j];
        }
        
        return answer;
    }
}

        //남아있는 배열A의 min과 배열B의 max인 요소끼리 곱해야 최소값의 결과가 나온다
        //1. 배열A와 B를 오름차순으로 재정렬한다
        //2. 배열 A는 인덱스0부터 B는 인덱스 마지막부터 요소를 순차적으로 곱한다