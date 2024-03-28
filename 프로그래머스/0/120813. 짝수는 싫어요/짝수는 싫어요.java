class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int length; //배열의 길이
        int j = 0; //배열인덱스++를 위한 장치
        
        if(n % 2 == 0) {
            length = n/2;
        } else {
            length = n/2+1;
        }
        answer = new int[length];
        
        for(int i = 0; i <= n; i++) {
            if(i%2 == 1) {
                answer[j] = i;
                j++;
            }
        }
        return answer;
    }
}