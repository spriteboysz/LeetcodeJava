package leetcode.editor.cn.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-25 23:40
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 48. 旋转图像
 */

public class P0048 {
    // code beginning
    class Solution {
        public void rotate(int[][] matrix) {
            int temp, n = matrix.length;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
                for (int j = 0; j < n / 2; j++) {
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[i][n - 1 - j];
                    matrix[i][n - 1 - j] = temp;
                }
            }

            for (int[] row : matrix) System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        Solution s = new P0048().new Solution();
        s.rotate(new int[][]{
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}});
    }
}