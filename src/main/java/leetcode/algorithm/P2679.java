package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-06-03 11:32
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description:
 */

public class P2679 {
    // code beginning
    class Solution {
        public int matrixSum(int[][] nums) {
            for (var row : nums) {
                Arrays.sort(row);
            }
            int sum = 0;
            for (int j = 0; j < nums[0].length; j++) {
                int maximum = 0;
                for (int[] num : nums) {
                    maximum = Math.max(maximum, num[j]);
                }
                sum += maximum;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2679().new Solution();
        Object ans = s.matrixSum(new int[][]{{7, 2, 1}, {6, 4, 2}, {6, 5, 3}, {3, 2, 1}});
        System.out.println(ans);
    }
}
