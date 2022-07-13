package leetcode.editor.cn.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-13 21:55
 * LastEditTime: 2022-07-13 21:55
 * Description: 2022. 将一维数组转变成二维数组
 */

public class P2022 {
    // code beginning
    class Solution {
        public int[][] construct2DArray(int[] original, int m, int n) {
            if (original.length != m * n) return new int[0][0];
            int[][] grid = new int[m][n];
            int index = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = original[index++];
                }
            }
            return grid;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2022().new Solution();
        int[][] ans = s.construct2DArray(new int[]{1, 2, 3}, 1, 3);
        for (int[] row : ans) System.out.println(Arrays.toString(row));
    }
}