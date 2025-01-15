import java.util.*;

public class Main {
    
    static int[][] dp;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dp = new int[30][30];
        int t = sc.nextInt();
        
        for(int i = 0; i < t; i++) {

            // n <= m
            int n = Integer.parseInt(sc.next()); // 서쪽
            int m = Integer.parseInt(sc.next()); // 동쪽

            System.out.println(factorial(m, n));
        }
    }
    
    static int factorial(int n, int r) {

        if(dp[n][r] > 0) {
            return dp[n][r];
        }

        if(n == r || r == 0) {
            return dp[n][r] = 1;
        }

        return dp[n][r] = factorial(n-1, r-1) + factorial(n-1, r);
    }

}