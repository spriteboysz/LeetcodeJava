package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-16 22:09
 * FileName: src/main/java/leetcode/algorithm
 * Description:59. 螺旋矩阵 II
 */

public class P0059 {
    // code beginning
    class Solution {
        public int[][] generateMatrix(int n) {
            int[][] matrix = new int[n][n];
            int left = 0, right = n - 1, top = 0, bottom = n - 1;
            for (int i = 1; i <= n * n; ) {
                for (int j = left; j <= right; j++) {
                    matrix[top][j] = i;
                    i++;
                }
                top++;

                for (int j = top; j <= bottom; j++) {
                    matrix[j][right] = i;
                    i++;
                }
                right--;

                for (int j = right; j >= left; j--) {
                    matrix[bottom][j] = i;
                    i++;
                }
                bottom--;

                for (int j = bottom; j >= top; j--) {
                    matrix[j][left] = i;
                    i++;
                }
                left++;
            }
            return matrix;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0059().new Solution();
        var ans = s.generateMatrix(4);
        System.out.println(Arrays.deepToString(ans));
    }
}
