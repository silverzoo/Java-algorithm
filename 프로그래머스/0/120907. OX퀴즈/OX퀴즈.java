class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) {
            String[] quizArr = quiz[i].split(" ");
            int result = Integer.parseInt(quizArr[0]) + Integer.parseInt(quizArr[2]) * ((quizArr[1].equals("+"))? 1 : -1);
            
            answer[i] = (result == Integer.parseInt(quizArr[4])) ? "O" : "X";
        }
        return answer;
    }
} // 더 간단하고 직관적인 코드.