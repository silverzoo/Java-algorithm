import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            while(!stack.isEmpty() && stack.peek() >= num) {
                stack.pop();
            }
            stack.push(num);
        }

        int[] stk = new int[stack.size()];
        for(int i = 0; i < stack.size(); i++) {
            stk[i] = stack.get(i);
            //stack.pop()은 후입선출, stack.get(i)은 특정인덱스
        }
        
        return stk;
    }
}

//stack 구조로 풀기