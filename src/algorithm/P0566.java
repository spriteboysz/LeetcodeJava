package algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-13 22:55
 * LastEditTime: 2022-07-13 22:55
 * Description: 566. 重塑矩阵
 */

public class P0566 {
    // code beginning
    class Solution {
        public int[][] matrixReshape(int[][] mat, int r, int c) {
            int n = mat.length, m = mat[0].length;
            if (m * n != r * c) return mat;
            int index = 0;
            int[][] grid = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    grid[i][j] = mat[index / m][index % m];
                    index++;
                }
            }
            return grid;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0566().new Solution();
        int[][] ans = s.matrixReshape(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}}, 4, 2);
        for (int[] row : ans) System.out.println(Arrays.toString(row));
    }
}