package leetcode.editor.cn.sword;

/**
 * Author: Deean
 * Date: 2022-07-10 15:49
 * LastEditTime: 2022-07-10 15:49
 * Description: 剑指 Offer II 088. 爬楼梯的最少成本
 */

public class OII0088 {
    // code beginning
    class Solution {
        public int minCostClimbingStairs(int[] cost) {
            int n = cost.length;
            int[] dp = new int[n + 1];
            for (int i = 2; i <= n; i++) {
                dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
            }
            return dp[n];
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0088().new Solution();
        Object ans = s.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1});
        System.out.println(ans);
    }
}