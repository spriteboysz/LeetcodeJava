package leetcode.editor.cn.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-13 21:39
 * LastEditTime: 2022-07-13 21:39
 * Description: 867. 转置矩阵
 */

public class P0867 {
    // code beginning
    class Solution {
        public int[][] transpose(int[][] matrix) {
            int n = matrix.length, m = matrix[0].length;
            int[][] grid = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = matrix[j][i];
                }
            }
            return grid;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0867().new Solution();
        int[][] ans = s.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}});
        for (int[] row : ans) System.out.println(Arrays.toString(row));
    }
}