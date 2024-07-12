package elice;

import java.util.Scanner;

public class WeekendTest1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        solution(n);
    }

    public static void solution(int N) {
        int cnt = 0;
        for(int i = 1; i <= N; i++) {
            int sum = 0;
            for(int j = i; j <= N; j++) {
                sum += j;
                if(sum > N) {
                    break;
                }
                else if(sum == N) {
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
