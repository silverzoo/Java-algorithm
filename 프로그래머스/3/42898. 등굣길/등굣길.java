import java.util.*;

class Solution {
    private final int MOD = 1000000007;
    private final int DISABLE = -1;

    public int solution(int m, int n, int[][] puddles) {
        int[][] dp = new int[n][m];
        for(int[] puddle: puddles) {
            dp[puddle[1]-1][puddle[0]-1] = DISABLE;
        }
        
        // init
        dp[0][0] = 1;
        for(int i = 1; i < m; i++) { // 가로
            if (dp[0][i] == DISABLE || dp[0][i-1] == DISABLE) {
                break;
            } else {
                dp[0][i] = 1;
            }
        }
        for(int i = 1; i < n; i++) { // 세로
            if (dp[i][0] == DISABLE || dp[i-1][0] == DISABLE) {
                break;
            } else {
                dp[i][0] = 1;
            }
        }
        
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++) {
                if(dp[i][j] == DISABLE) continue;
                
                if (dp[i-1][j] == DISABLE) {
                    dp[i][j] = dp[i][j-1];
                } else if (dp[i][j-1] == DISABLE) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = (dp[i-1][j] % MOD + dp[i][j-1] % MOD) % MOD;
                }
            }
        }
        
        return dp[n-1][m-1] % MOD;
    }
}