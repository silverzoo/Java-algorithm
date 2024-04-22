import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[score.length];
        
        for(int i = 0; i < score.length; i++) {
            list.add(score[i][0]+score[i][1]);
        }
        
        list.sort(Comparator.reverseOrder());
        
        //list와 일치하는 가장 첫번째 인덱스 반환
        for(int i = 0; i < score.length; i++) {
            answer[i] = list.indexOf(score[i][0]+score[i][1]) + 1;
        }
        
        return answer;
    }
}
//평균-> (score[i][0] + score[i][1]) / 2
//공동이 있으면 공동등수의 다음 등수는 +(공동명 수) 된다.