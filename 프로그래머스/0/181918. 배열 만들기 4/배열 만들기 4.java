import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList();
        
        for(int i = 0; i < arr.length; i++) {
            
            if(list.isEmpty()) {
                list.add(arr[i]);
            } else {
                if(list.get(list.size()-1)< arr[i]) {
                    list.add(arr[i]);
                } else {
                    list.remove(list.size()-1);
                    i--; //i에 1을 더하라는 조건이 없다.
                }
            }
        }
        
        int[] stk = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            stk[i] = list.get(i);
        }
        
        return stk;
    }
}