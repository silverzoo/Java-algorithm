import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);

        return Arrays.copyOf(num_list, 5);
    }
}

//배열을 복사해서 특정 길이까지 출력하는 함수
        
//Arrays.copyOf(원본배열,길이)
//Arrays.copyOfRange(원본배열,시작인덱스,끝인덱스)