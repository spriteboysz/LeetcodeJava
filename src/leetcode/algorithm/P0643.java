package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-19 22:33
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 643. 子数组最大平均数 I
 */

public class P0643 {
    // code beginning
    class Solution {
        public double findMaxAverage(int[] nums, int k) {
            int sum = 0;
            for (int i = 0; i < k; i++) sum += nums[i];
            int maxSum = sum;
            for (int i = k; i < nums.length; i++) {
                sum = sum - nums[i - k] + nums[i];
                maxSum = Math.max(maxSum, sum);
            }
            return 1.0 * maxSum / k;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0643().new Solution();
        Object ans = s.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4);
        System.out.println(ans);
    }
}