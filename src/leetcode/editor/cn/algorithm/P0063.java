package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-23 23:01
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 63. 不同路径 II
 */

public class P0063 {
    // code beginning
    class Solution {
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            if (obstacleGrid == null || obstacleGrid.length == 0) return 0;
            int n = obstacleGrid.length, m = obstacleGrid[0].length;
            int[][] dp = new int[n][m];
            for (int i = 0; i < n && obstacleGrid[i][0] != 1; i++) {
                dp[i][0] = 1;
            }
            for (int i = 0; i < m && obstacleGrid[0][i] != 1; i++) {
                dp[0][i] = 1;
            }
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    if (obstacleGrid[i][j] == 0) {
                        dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                    }
                }
            }
            return dp[n - 1][m - 1];
        }
    }

    public static void main(String[] args) {
        Solution s = new P0063().new Solution();
        Object ans = s.uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}});
        System.out.println(ans);
    }
}