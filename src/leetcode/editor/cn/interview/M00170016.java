package leetcode.editor.cn.interview;

/**
 * Author: Deean
 * Date: 2022-07-12 23:07
 * LastEditTime: 2022-07-12 23:07
 * Description: 面试题 17.16. 按摩师
 */

public class M00170016 {
    // code beginning
    class Solution {
        public int massage(int[] nums) {
            int n = nums.length;
            if (n == 0) return 0;
            if (n < 2) return nums[0];
            int[] dp = new int[n];
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0], nums[1]);
            for (int i = 2; i < n; i++) {
                dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
            }
            return dp[n - 1];
        }
    }

    public static void main(String[] args) {
        Solution s = new M00170016().new Solution();
        Object ans = s.massage(new int[]{2, 1, 4, 5, 3, 1, 1, 3});
        System.out.println(ans);
    }
}