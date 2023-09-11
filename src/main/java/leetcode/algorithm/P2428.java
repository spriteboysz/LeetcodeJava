package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-08 22:53
 * FileName: src/leetcode/algorithm
 * Description:2428. 沙漏的最大总和
 */

public class P2428 {
    // code beginning
    class Solution {
        public int maxSum(int[][] grid) {
            int maximum = 0;
            for (int i = 1, m = grid.length; i < m - 1; i++) {
                for (int j = 1, n = grid[0].length; j < n - 1; j++) {
                    int sum = grid[i][j];
                    for (int k = -1; k <= 1; k++) {
                        sum += grid[i - 1][j + k] + grid[i + 1][j + k];
                    }
                    maximum = Math.max(maximum, sum);
                }
            }
            return maximum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2428().new Solution();
        var ans = s.maxSum(new int[][]{{6, 2, 1, 3}, {4, 2, 1, 5}, {9, 2, 8, 7}, {4, 1, 2, 9}});
        System.out.println(ans);
    }
}
