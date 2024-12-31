class Solution {
    public int solution(int[][] triangle) {
        int len = triangle.length;
        int[][] ans = new int[len][len];
        for(int i = 0; i < len; i++) {
            for(int j = 0; j <= i; j++) {
                ans[i][j] = triangle[i][j];
            }
        }

        for(int i = 1; i < len; i++) {
            ans[i][0] = ans[i - 1][0] + triangle[i][0];
            ans[i][i] = ans[i - 1][i - 1] + triangle[i][i];
        }

        for(int i = 2; i < len; i++) {
            for(int j = 1; j < i; j++) {
                ans[i][j] = Math.max(ans[i-1][j-1], ans[i-1][j]) + triangle[i][j];
            }
        }

        int answer = Integer.MIN_VALUE;
        for(int i = 0; i < len; i++) {
            answer = Math.max(answer, ans[len-1][i]);
        }

        return answer;
    }
}