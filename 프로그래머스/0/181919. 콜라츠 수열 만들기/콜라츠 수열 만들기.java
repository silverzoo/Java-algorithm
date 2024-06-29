import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList();
        
        list.add(n);
        
        while(n != 1) {
            if(n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            list.add(n);
        }
        
        int[] answer = new int[list.size()];
        int idx = 0;
        
        for(int num : list) {
            answer[idx++] = num;
        }
        
        return answer;
    }
}