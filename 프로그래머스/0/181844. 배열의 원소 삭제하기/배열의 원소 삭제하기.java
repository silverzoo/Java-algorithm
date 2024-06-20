import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : arr) {
            list.add(i);
        }
        
        for(int i : delete_list) {
            //remove()는 Object(객체)를 매개변수로 받으므로 :Integer타입으로 받아야한다.
            list.remove((Integer)i);
        }

        int[] answer = new int[list.size()];
        
        for(int k = 0; k < list.size(); k++) {
            answer[k] = list.get(k);
        }

        return answer;
    }
}