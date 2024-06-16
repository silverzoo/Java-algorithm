import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> answer = new ArrayList();
        for(String str : strArr) {
            if(!str.contains("ad")) {
                answer.add(str);
            }
        }
        return answer.toArray(String[]::new);
    }
}

//String[]::new 의 의미? 아직 못 찾음;;