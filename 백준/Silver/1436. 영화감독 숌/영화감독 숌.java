import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int num = 666, cnt = 1;
        
        while(n != cnt) {
            num++;
            if(String.valueOf(num).contains("666")) {
                cnt++;
            }
        }
        
        System.out.println(num);
    }
}