import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int day = sc.nextInt();
        int[] arr = new int[size];

        arr[0] = sc.nextInt();
        for(int i = 1; i < size; i++){
            arr[i] = arr[i-1] + sc.nextInt();
        }

        int max = arr[day-1];
        for(int i = day; i<size; i++){
            max = Math.max(arr[i] - arr[i - day], max);
        }

        System.out.println(max);
    }
}
