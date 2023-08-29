package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-17 10:42
 * LastEditTime: 2022-07-17 10:42
 * Description: 807. 保持城市天际线
 */

public class P0807 {
    // code beginning
    class Solution {
        public int maxIncreaseKeepingSkyline(int[][] grid) {
            int n = grid.length, count = 0;
            int[] rowMax = new int[n], colMax = new int[n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    rowMax[i] = Math.max(rowMax[i], grid[i][j]);
                    colMax[j] = Math.max(colMax[j], grid[i][j]);
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    count += Math.min(rowMax[i], colMax[j]) - grid[i][j];
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0807().new Solution();
        Object ans = s.maxIncreaseKeepingSkyline(new int[][]{{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}});
        System.out.println(ans);
    }
}