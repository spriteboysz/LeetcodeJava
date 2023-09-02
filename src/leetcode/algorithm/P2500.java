package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-02-26 13:17
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 2500. 删除每行中的最大值
 */

public class P2500 {
    // code beginning
    class Solution {
        public int deleteGreatestValue(int[][] grid) {
            for (int[] row : grid) {
                Arrays.sort(row);
            }
            int greatest = 0;
            for (int i = grid[0].length - 1; i >= 0; i--) {
                int maximum = 0;
                for (int[] row : grid) {
                    maximum = Math.max(maximum, row[i]);
                }
                greatest += maximum;
            }
            return greatest;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2500().new Solution();
        Object ans = s.deleteGreatestValue(new int[][]{{1, 2, 4}, {3, 3, 1}});
        System.out.println(ans);
    }
}
