package sword;

/**
 * Author: Deean
 * Date: 2022-07-28 23:56
 * LastEditTime: 2022-07-28 23:56
 * Description: 剑指 Offer II 098. 路径的数目
 */

public class OII0098 {
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
        Solution s = new OII0098().new Solution();
        Object ans = s.uniquePaths(3, 7);
        System.out.println(ans);
    }
}