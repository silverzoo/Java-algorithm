class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String answer = "";
        
        for(int i = 0; i < finished.length; i++) {
            answer = (!finished[i])? answer+todo_list[i]+"," : answer;
        }
        
        return answer.split(",");
    }
}

//우려했던 상황 : ","로 여러개 끝나거나 시작되면 공백이 인식되지 않을까?
//공백이 아닌 null로 인식되어서 올바르게 출력된다.

//단, 중간에 ,,처럼 여러개가 들어가면 공백이 인식이 된다. 왜?