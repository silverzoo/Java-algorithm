class Solution {
    public int solution(int[] num_list) {
        int answer = (num_list.length <= 10)? 1 : 0;
        
        for(int num : num_list) {
            answer = (num_list.length <= 10)? answer * num: answer + num;
        }
        return answer;
    }
}