package leetcode.sword;

/**
 * Author: Deean
 * Date: 2022-07-29 00:12
 * LastEditTime: 2022-07-29 00:12
 * Description: 剑指 Offer 47. 礼物的最大价值
 */

public class O0047 {
    // code beginning
    class Solution {
        public int maxValue(int[][] grid) {
            int m = grid.length, n = grid[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 & j == 0) continue;
                    if (i == 0) {
                        grid[i][j] += grid[i][j - 1];
                    } else if (j == 0) {
                        grid[i][j] += grid[i - 1][j];
                    } else {
                        grid[i][j] += Math.max(grid[i - 1][j], grid[i][j - 1]);
                    }
                }
            }
            return grid[m - 1][n - 1];
        }
    }

    public static void main(String[] args) {
        Solution s = new O0047().new Solution();
        Object ans = s.maxValue(new int[][]
                {{1, 3, 1},
                        {1, 5, 1},
                        {4, 2, 1}});
        System.out.println(ans);
    }
}