package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-08 23:17
 * Description: 1582. 二进制矩阵中的特殊位置
 */

public class P1582 {
    // code beginning
    class Solution {
        public int numSpecial(int[][] mat) {
            int n = mat.length, m = mat[0].length;
            int[] row = new int[n], col = new int[m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (mat[i][j] == 1) {
                        row[i]++;
                        col[j]++;
                    }
                }
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (mat[i][j] == 1 && row[i] == 1 && col[j] == 1) count++;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1582().new Solution();
        Object ans = s.numSpecial(new int[][]{
                {0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1}});
        System.out.println(ans);
    }
}