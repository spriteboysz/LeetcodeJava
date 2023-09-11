package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-03 22:23
 * FileName: src/leetcode/algorithm
 * Description:2643. 一最多的行
 */

public class P2643 {
    // code beginning
    class Solution {
        public int[] rowAndMaximumOnes(int[][] mat) {
            int maxIndex = 0, maxValue = 0;
            for (int i = 0, m = mat.length; i < m; i++) {
                int sum = 0;
                for (int j = 0, n = mat[0].length; j < n; j++) {
                    sum += mat[i][j];
                }
                if (sum > maxValue) {
                    maxValue = sum;
                    maxIndex = i;
                }
            }
            return new int[]{maxIndex, maxValue};
        }
    }

    public static void main(String[] args) {
        Solution s = new P2643().new Solution();
        Object ans = s.rowAndMaximumOnes(new int[][]{{0, 1}, {1, 0}});
        System.out.println(Arrays.toString((int[]) ans));
    }
}
