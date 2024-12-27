import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> min = new PriorityQueue<>();
        
        for (String operation : operations) {
            String[] split = operation.split(" ");
            String command = split[0];
            int number = Integer.parseInt(split[1]);

            switch (command) {
                case "I":
                    min.add(number);
                    max.add(number);
                    break;
                case "D":
                    if (number == 1 && !max.isEmpty()) {
                        int maxNum = max.poll();
                        min.remove(maxNum);
                    } else if (number == -1 && !min.isEmpty()) {
                        int minNum = min.poll();
                        max.remove(minNum);
                    }
                    break;
            }
        }
        
        int[] answer = {0, 0};
        if (!min.isEmpty() && !max.isEmpty()) {
            answer[0] = max.poll();
            answer[1] = min.poll();
        }
        
        return answer;
    }
}