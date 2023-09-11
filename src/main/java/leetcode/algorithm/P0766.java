package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-15 21:36
 * LastEditTime: 2022-07-15 21:36
 * Description: 766. 托普利茨矩阵
 */

public class P0766 {
    // code beginning
    class Solution {
        public boolean isToeplitzMatrix(int[][] matrix) {
            int n = matrix.length, m = matrix[0].length;
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    if (matrix[i][j] != matrix[i - 1][j - 1]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0766().new Solution();
        Object ans = s.isToeplitzMatrix(new int[][]{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}});
        System.out.println(ans);
    }
}