import java.io.*;

import java.util.StringTokenizer;

public class Main {
    public static int cnt = 0;
    public static int dpCnt = 0;
    public static int[] dp;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new int[n+1];

        fib(n);
        fibonacci(n);
        System.out.println(cnt + " " + dpCnt);
    }

    public static int fib(int n){
        if(n==1 || n==2)
        {
            cnt++;
            return 1;
        }
        else
        {
            return fib(n-2) + fib(n-1);
        }
    }

    public static int fibonacci(int n){
        dp[1] = dp[2] = 1;
        for(int i=3; i<=n; i++)
        {
            dp[i] = dp[i-2] + dp[i-1];
            dpCnt++;
        }
        return dp[n];
    }
}