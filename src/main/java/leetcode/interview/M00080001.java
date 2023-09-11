package leetcode.interview;

/**
 * Author: Deean
 * Date: 2022-08-15 22:59
 * FileName: src/leetcode/editor/cn/leetcode.interview
 * Description: 面试题 08.01. 三步问题
 */

public class M00080001 {
    // code beginning
    class Solution {
        public int waysToStep(int n) {
            if (n <= 2) return n;
            int MOD = 1000000007;
            int[] dp = new int[n + 1];
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;
            for (int i = 4; i <= n; i++) {
                dp[i] = (dp[i - 1] + (dp[i - 2] + dp[i - 3]) % MOD) % MOD;
            }
            return dp[n];
        }
    }

    public static void main(String[] args) {
        Solution s = new M00080001().new Solution();
        Object ans = s.waysToStep(5);   // 13
        System.out.println(ans);
    }
}