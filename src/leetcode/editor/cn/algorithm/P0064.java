package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-29 00:10
 * LastEditTime: 2022-07-29 00:10
 * Description: 64. 最小路径和
 */

public class P0064 {
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
        Solution s = new P0064().new Solution();
        Object ans = s.minPathSum(new int[][]{{1, 2, 3}, {4, 5, 6}});
        System.out.println(ans);
    }
}