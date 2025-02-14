import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        
        for(int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int sum = sc.nextInt();
        
        System.out.println(count(length, arr, sum));
    }
    
    public static int count(int length, int[] arr, int sum) {
        int result = 0;
        int lt = 0;
        int rt = length-1;
        
        Arrays.sort(arr);
        
        while (lt < rt) {
            int tmp = arr[lt] + arr[rt];
            
            // 정답일시, 투포인터 모두 증감시켜서 중복 제거
            if (tmp == sum) {
                result++;
                lt++;
                rt--;
            } else if (tmp < sum) {
                lt++;
            } else {
                rt--;
            }
        }
        return result;
    }
}