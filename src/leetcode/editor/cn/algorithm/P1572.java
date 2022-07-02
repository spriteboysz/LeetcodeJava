package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-02 21:54
 * LastEditTime: 2022-07-02 21:54
 * Description: 1572. 矩阵对角线元素的和
 */

public class P1572 {
    // code beginning
    class Solution {
        public int diagonalSum(int[][] mat) {
            int sum = 0, n = mat.length;
            for (int i = 0; i < n; i++) {
                sum += mat[i][i] + mat[i][n - 1 - i];
                if (i == n - 1 - i) sum -= mat[i][i];
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1572().new Solution();
        Object ans = s.diagonalSum(new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}});
        System.out.println(ans);    // 8
        ans = s.diagonalSum(new int[][]{{5}});
        System.out.println(ans);    // 5
    }
}