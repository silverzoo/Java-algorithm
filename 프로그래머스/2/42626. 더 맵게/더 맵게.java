import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        Queue<Integer> scovilles = new PriorityQueue<>();
        
        for (int level: scoville) {
            scovilles.add(level);
        }
        
        int mix = -1;
        int ans = 0;
        while (scovilles.peek() < K) {
            if (scovilles.size() < 2) {
                return -1;
            }
            int first = scovilles.poll();
            int second = scovilles.poll();
            mix = first + second * 2;
            scovilles.add(mix);
            ans++;
        }
        
        return ans;
    }
}