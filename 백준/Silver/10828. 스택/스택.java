import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            String command = sc.nextLine();
            
            if (command.startsWith("push")) {
                int num = Integer.parseInt(command.split(" ")[1]);
                stack.push(num);
            } 
            else if (command.equals("pop")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
            } 
            else if (command.equals("size")) {
                System.out.println(stack.size());
            } 
            else if (command.equals("empty")) {
                System.out.println(stack.isEmpty() ? 1 : 0);
            } 
            else if (command.equals("top")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            }
        }
    }
}
