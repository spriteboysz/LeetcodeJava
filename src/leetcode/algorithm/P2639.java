package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-04 23:26
 * FileName: src/leetcode/algorithm
 * Description:2639. 查询网格图中每一列的宽度
 */

public class P2639 {
    // code beginning
    class Solution {
        public int[] findColumnWidth(int[][] grid) {
            int n = grid[0].length;
            int[] width = new int[n];
            for (int j = 0; j < n; j++) {
                int maximum = 0;
                for (int[] column : grid) {
                    maximum = Math.max(maximum, String.valueOf(column[j]).length());
                }
                width[j] = maximum;
            }
            return width;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2639().new Solution();
        Object ans = s.findColumnWidth(new int[][]{{-15, 1, 3}, {15, 7, 12}, {5, 6, -2}});
        System.out.println(Arrays.toString((int[]) ans));
    }
}
