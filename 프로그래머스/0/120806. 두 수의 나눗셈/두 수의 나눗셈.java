class Solution {
    public int solution(int num1, int num2) {
        boolean val = ((0<num1&&num1<=100) && (0<num2&&num2<=100));
        float div = 0;
        int answer = 0;
        
        if(val) {
            div = (float)num1/num2;
            answer = (int)(div*1000);
        }
        return answer;
    }
}