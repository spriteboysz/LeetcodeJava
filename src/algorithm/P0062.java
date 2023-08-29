package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-29 00:01
 * LastEditTime: 2022-07-29 00:01
 * Description: 62. 不同路径
 */

public class P0062 {
    // code beginning
    class Solution {
        public int uniquePaths(int m, int n) {
            int[][] grid = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 && j == 0) {
                        grid[i][j] = 1;
                    } else if (i == 0) {
                        grid[i][j] += grid[i][j - 1];
                    } else if (j == 0) {
                        grid[i][j] += grid[i - 1][j];
                    } else {
                        grid[i][j] = grid[i][j - 1] + grid[i - 1][j];
                    }
                }
            }
            return grid[m - 1][n - 1];
        }
    }

    public static void main(String[] args) {
        Solution s = new P0062().new Solution();
        Object ans = s.uniquePaths(3, 7);
        System.out.println(ans);
    }
}