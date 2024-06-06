class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        for(int num : num_list) {
            answer = (num_list.length <= 10)? answer * num: answer + num;
        }
        return (num_list.length <= 10)? answer : answer - 1;
    }
}