package sword;

/**
 * Author: Deean
 * Date: 2022-08-07 17:45
 * Description: 剑指 Offer II 089. 房屋偷盗
 */

public class OII0089 {
    // code beginning
    class Solution {
        public int rob(int[] nums) {
            if (nums.length == 1) return nums[0];

            int[] dp = new int[nums.length];
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0], nums[1]);

            for (int i = 2; i < nums.length; i++) {
                dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
            }
            return dp[nums.length - 1];
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0089().new Solution();
        Object ans = s.rob(new int[]{2, 7, 9, 3, 1});
        System.out.println(ans);
    }
}