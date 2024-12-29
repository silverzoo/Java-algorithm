import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int n = jobs.length;
        
        // 현재 남은 요청중에 가장 빨리 시작하는 순서 
        Queue<int[]> request = new PriorityQueue<>((o1, o2)->{
            if(o1[0] != o2[0]) return o1[0] - o2[0];
            return o1[1] - o2[1];
        });
        
        for(int [] job : jobs){
            request.add(job);
        }
        
        // pq -> 하드 디스크 
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2)->{
            if(o1[1] != o2[1]) return o1[1] - o2[1];
            return o1[0] - o2[0];
        });
        
        int sum  = 0; 
        int time = 0; 
        
        Stack<int[]> stack = new Stack<>(); 
        
        while(!request.isEmpty() || !pq.isEmpty()){
            // 작업 수행 x -> 먼저 요청이 들어온 작업
            if(pq.isEmpty()){
                int [] temp = request.poll();
                sum += temp[1]; // 대기 없이 소요시간만 추가 
                time = Math.max(time + temp[1], temp[0] + temp[1]);
            }
            // 작업이 있으면 가장 소요 시간이 적은 작업 수행 
            else{
                int [] temp = pq.poll();
                sum += temp[1] + time - temp[0];
                time = Math.max(time + temp[1], temp[0] + temp[1]);
            }
            int size = request.size();
            // 현재 작업이 끝나는 시간까지 요청이 있는 경우 -> 추가 
            for(int i = 0; i < size; i++){
                if(request.peek()[0] <= time) pq.add(request.poll());
                else stack.add(request.poll());
            }
            while(!stack.isEmpty()) request.add(stack.pop());
        }

        return sum / n;
    }
}