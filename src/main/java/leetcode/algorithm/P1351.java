package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-08 22:10
 * LastEditTime: 2022-07-08 22:10
 * Description: 1351. 统计有序矩阵中的负数
 */

public class P1351 {
    // code beginning
    class Solution {
        public int countNegatives(int[][] grid) {
            int n = grid[0].length, count = 0;
            for (int[] ints : grid) {
                for (int j = 0; j < n; j++) {
                    if (ints[j] < 0) count++;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1351().new Solution();
        Object ans = s.countNegatives(new int[][]{{3, 2}, {1, 0}});
        System.out.println(ans);
    }
}