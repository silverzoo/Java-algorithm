import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> arr = new ArrayList();
        
        for(String str : my_string.split(" ")) {
            if(!str.equals("")) {
                arr.add(str);
            }
        }
        
        return arr.toArray(new String[arr.size()]);
    }
}