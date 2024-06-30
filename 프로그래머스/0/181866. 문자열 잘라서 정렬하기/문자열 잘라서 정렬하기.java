import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myString) {
        ArrayList<String> list = new ArrayList();
        
        for(String str : myString.split("x")) {
            if(!str.equals("")) {
                list.add(str);
            }
        }
        
        String[] answer = list.toArray(String[]::new);
        Arrays.sort(answer);
        
        return answer;
    }
}