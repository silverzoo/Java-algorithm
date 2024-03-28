class Solution {
    public int[] solution(int n) {
        int length = 0; //배열의 길이

        if(n % 2 == 0) length = n/2;
        else length = n/2 + 1;

        int[] answer = new int[length];
        int num = 1; //홀수값을 담을 그릇
        
        for(int i = 0; i < length; i++) {
            answer[i] = num;
            num += 2;
        }
        return answer;
    }
}