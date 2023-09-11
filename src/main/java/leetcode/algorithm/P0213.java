package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-07 20:06
 * Description: 213. 打家劫舍 II
 */

public class P0213 {
    // code beginning
    class Solution {
        public int rob(int[] nums) {
            if (nums.length == 1) return nums[0];
            return Math.max(robRange(nums, 0, nums.length - 1), robRange(nums, 1, nums.length));
        }

        private int robRange(int[] nums, int start, int end) {
            int[] dp = new int[nums.length + 1];
            dp[start] = 0;
            dp[start + 1] = nums[start];
            for (int i = start + 2; i <= end; i++) {
                dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
            }
            return dp[end];
        }
    }

    public static void main(String[] args) {
        Solution s = new P0213().new Solution();
        Object ans = s.rob(new int[]{1, 2, 3});
        System.out.println(ans);
    }
}