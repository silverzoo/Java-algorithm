import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int leng = num_list.length;
        int[] answer = Arrays.copyOf(num_list,leng+1);
        
        int end = num_list[leng-1];
        int second = num_list[leng-2];
        answer[leng] = (end > second)? end - second : end * 2;
        
        return answer;
    }
}