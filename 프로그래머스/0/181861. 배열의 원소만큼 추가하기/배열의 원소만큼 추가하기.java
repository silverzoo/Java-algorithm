import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList();
        
        for(int i : arr) {
            for(int k = 0; k < i; k++)
                list.add(i);
        }
        
        int[] answer = new int[list.size()];
        
        for(int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }
        
        return answer;
    }
}