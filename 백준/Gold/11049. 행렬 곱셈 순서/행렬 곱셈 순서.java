import java.io.*;

public class Main {
    static int[][] matrix;
    static int[][] dp;
    static int N;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        N = Integer.parseInt(br.readLine());
        matrix = new int[N][2];
        dp = new int[N][N];
        
        for(int i = 0; i<N; i++) {
            String[] input = br.readLine().split(" ");
            matrix[i][0] = Integer.parseInt(input[0]);
            matrix[i][1] = Integer.parseInt(input[1]);
        }
        
        for(int i = 0; i<N; i++) {
            for(int j = 0; j<N; j++) {
                if (i == j) {
                    dp[i][j] = 0;
                } else if (j == i + 1) {
                    dp[i][j] = matrix[i][0] * matrix[i][1] * matrix[j][1];
                } else {
                    dp[i][j] = 987654321;
                }
            }
        }
        
        /*
            i : 간격
            j : 시작 지점
            k : 중간 지점
         */
        for(int i = 2; i<N; i++) {
            for(int j = 0; j<N-i; j++) {
                for(int k = j; k<j+i; k++) {
                    int count = matrix[j][0] * matrix[k][1] * matrix[j+i][1];
                    dp[j][j+i] = Math.min(dp[j][j+i], dp[j][k] + dp[k+1][j+i] + count);
                }
            }
        }
        
        System.out.println(dp[0][N-1]);
    }
}
