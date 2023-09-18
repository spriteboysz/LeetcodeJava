package leetcode.interview;

import leetcode.common.Utils;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-17 14:09
 * FileName: src/main/java/leetcode/interview
 * Description:面试题 01.07. 旋转矩阵
 */

public class M00010007 {
    // code beginning
    class Solution {
        public void rotate(int[][] matrix) {
            int n = matrix.length;
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n / 2; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][n - 1 - j];
                    matrix[i][n - 1 - j] = temp;
                }
            }
            System.out.println(Arrays.deepToString(matrix));
        }
    }

    public static void main(String[] args) {
        Solution s = new M00010007().new Solution();
        s.rotate(Utils.to2DArray("[[1,2,3],[4,5,6],[7,8,9]]"));
    }
}
