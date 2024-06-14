import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList();
        
        for(int i = l; i <= r; i++) {
            //0또는 5가 1개이상인 모든 수라면 list에 추가한다
            if(String.valueOf(i).matches("[05]+")) {
                list.add(i);
            }
        }
        
        if(list.isEmpty()) {
            return new int[] {-1};
        }
        
        int[] answer = new int[list.size()];
        
        for(int k = 0; k < list.size(); k++) {
            answer[k] = list.get(k);
        }
        
        return answer;
    }
}