import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        //소수 중 가장 작은 수 2부터 시작
        //소수로 나눌 수 있을 때 까지 나눈 후 리스트에 add
        for(int i = 2; i <= n; i++) {
            if(n%i == 0) {
                while(n%i == 0) n /= i;
                list.add(i);
            }
        }
        
        //arrayList -> array
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
} //배열 사이즈가 고정적이지 않은 경우 list를 활용해야 함