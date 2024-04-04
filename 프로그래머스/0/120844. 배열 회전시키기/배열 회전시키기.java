class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        return switch(direction) {
                case "left" -> left(answer,numbers);
                case "right" -> right(answer,numbers);
                default -> answer;
        };
    }
    
    public int[] left(int[] answer, int[] numbers) {
        
        answer[numbers.length-1] = numbers[0];
        for(int i = 0; i < numbers.length-1; i++) {
            answer[i] = numbers[i+1];
        }
        return answer;
    }
    
    public int[] right(int[] answer, int[] numbers) {
        
        answer[0] = numbers[numbers.length-1];
        for(int i = 0; i < numbers.length-1; i++) {
            answer[i+1] = numbers[i];
        }
        return answer;
    }
}