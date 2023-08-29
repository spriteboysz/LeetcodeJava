package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-06 22:38
 * LastEditTime: 2022-07-06 22:38
 * Description: 1380. 矩阵中的幸运数
 */

public class P1380 {
    // code beginning
    class Solution {
        public List<Integer> luckyNumbers(int[][] matrix) {
            int n = matrix.length, m = matrix[0].length;
            int[] row = new int[n], col = new int[m];
            for (int i = 0; i < n; i++) {
                row[i] = Integer.MAX_VALUE;
                for (int j = 0; j < m; j++) {
                    row[i] = Math.min(row[i], matrix[i][j]);
                    col[j] = Math.max(col[j], matrix[i][j]);
                }
            }

            List<Integer> lucky = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (matrix[i][j] == row[i] && matrix[i][j] == col[j]) lucky.add(matrix[i][j]);
                }
            }
            return lucky;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1380().new Solution();
        Object ans = s.luckyNumbers(new int[][]{{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}});
        System.out.println(ans);
    }
}