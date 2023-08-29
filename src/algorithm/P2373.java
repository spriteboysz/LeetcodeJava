package algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-17 23:32
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2373. 矩阵中的局部最大值
 */

public class P2373 {
    // code beginning
    class Solution {
        public int[][] largestLocal(int[][] grid) {
            int n = grid.length;
            int[][] local = new int[n - 2][n - 2];
            for (int i = 1; i < n - 1; i++) {
                for (int j = 1; j < n - 1; j++) {
                    int max = Integer.MIN_VALUE;
                    for (int di = -1; di <= 1; di++) {
                        for (int dj = -1; dj <= 1; dj++) {
                            max = Math.max(max, grid[i + di][j + dj]);
                        }
                    }
                    local[i - 1][j - 1] = max;
                }
            }
            return local;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2373().new Solution();
        int[][] ans = s.largestLocal(new int[][]{
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}});
        for (int[] row : ans) System.out.println(Arrays.toString(row));
    }
}