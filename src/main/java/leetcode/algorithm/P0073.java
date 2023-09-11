package leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-08-02 23:13
 * LastEditTime: 2022-08-02 23:13
 * Description: 73. 矩阵置零
 */

public class P0073 {
    // code beginning
    class Solution {
        public void setZeroes(int[][] matrix) {
            Set<Integer> row = new HashSet<>(), col = new HashSet<>();
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == 0) {
                        row.add(i);
                        col.add(j);
                    }
                }
            }
            for (int r : row) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[r][j] = 0;
                }
            }
            for (int c : col) {
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][c] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P0073().new Solution();
        s.setZeroes(new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}});
    }
}