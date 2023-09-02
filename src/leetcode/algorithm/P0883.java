package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-06 22:51
 * LastEditTime: 2022-07-06 22:51
 * Description: 883. 三维形体投影面积
 */

public class P0883 {
    // code beginning
    class Solution {
        public int projectionArea(int[][] grid) {
            int n = grid.length, area = 0;
            int[] row = new int[n], col = new int[n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    row[i] = Math.max(row[i], grid[i][j]);
                    col[j] = Math.max(col[j], grid[i][j]);
                    if (grid[i][j] != 0) area++;
                }
            }

            for (int i = 0; i < n; i++) {
                area += row[i] + col[i];
            }
            return area;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0883().new Solution();
        Object ans = s.projectionArea(new int[][]{{1, 0}, {0, 2}});
        System.out.println(ans);
    }
}