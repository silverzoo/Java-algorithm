class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) {
            String[] quizArr = quiz[i].split(" ");
            
            for(int j = 0; j < quizArr.length; j++) {
                if(quizArr[j].equals("-")) {
                    answer[i] = (Integer.parseInt(quizArr[j-1]) - Integer.parseInt(quizArr[j+1]) == Integer.parseInt(quizArr[quizArr.length-1]))? "O" : "X";
                } else if(quizArr[j].equals("+")) {
                    answer[i] = (Integer.parseInt(quizArr[j-1]) + Integer.parseInt(quizArr[j+1]) == Integer.parseInt(quizArr[quizArr.length-1]))? "O" : "X";
                }
            }
        }
        return answer;
    }
}