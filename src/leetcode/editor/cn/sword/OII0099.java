package leetcode.editor.cn.sword;

/**
 * Author: Deean
 * Date: 2022-07-29 00:05
 * LastEditTime: 2022-07-29 00:05
 * Description: 剑指 Offer II 099. 最小路径之和
 */

public class OII0099 {
    // code beginning
    class Solution {
        public int minPathSum(int[][] grid) {
            int m = grid.length, n = grid[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 & j == 0) continue;
                    if (i == 0) {
                        grid[i][j] += grid[i][j - 1];
                    } else if (j == 0) {
                        grid[i][j] += grid[i - 1][j];
                    } else {
                        grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
                    }
                }
            }
            return grid[m - 1][n - 1];
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0099().new Solution();
        Object ans = s.minPathSum(new int[][]{{1, 2, 3}, {4, 5, 6}});
        System.out.println(ans);
    }
}