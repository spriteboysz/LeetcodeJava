package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-08 22:22
 * FileName: src/leetcode/algorithm
 * Description:2482. 行和列中一和零的差值
 */

public class P2482 {
    // code beginning
    class Solution {
        public int[][] onesMinusZeros(int[][] grid) {
            int m = grid.length, n = grid[0].length;
            int[] row1 = new int[m], col1 = new int[n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1) {
                        row1[i] += 1;
                        col1[j] += 1;
                    }
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = 2 * row1[i] + 2 * col1[j] - m - n;
                }
            }
            return grid;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2482().new Solution();
        var ans = s.onesMinusZeros(new int[][]{{0, 1, 1}, {1, 0, 1}, {0, 0, 1}});
        System.out.println(Arrays.deepToString(ans));
    }
}
