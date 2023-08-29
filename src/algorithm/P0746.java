package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-11 23:51
 * LastEditTime: 2022-07-11 23:51
 * Description: 746. 使用最小花费爬楼梯
 */

public class P0746 {
    // code beginning
    class Solution {
        public int minCostClimbingStairs(int[] cost) {
            int[] dp = new int[cost.length + 1];
            for (int i = 2; i <= cost.length; i++) {
                dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
            }
            return dp[cost.length];
        }
    }

    public static void main(String[] args) {
        Solution s = new P0746().new Solution();
        Object ans = s.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1});
        System.out.println(ans);
    }
}