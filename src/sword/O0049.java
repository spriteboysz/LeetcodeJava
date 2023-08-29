package sword;

/**
 * Author: Deean
 * Date: 2022-07-23 22:19
 * LastEditTime: 2022-07-23 22:19
 * Description: 剑指 Offer 49. 丑数
 */

public class O0049 {
    // code beginning
    class Solution {
        public int nthUglyNumber(int n) {
            int[] dp = new int[n];
            dp[0] = 1;
            int a = 0, b = 0, c = 0;
            for (int i = 1; i < n; i++) {
                dp[i] = Math.min(Math.min(dp[a] * 2, dp[b] * 3), dp[c] * 5);
                if (dp[i] == dp[a] * 2) a++;
                if (dp[i] == dp[b] * 3) b++;
                if (dp[i] == dp[c] * 5) c++;
            }
            return dp[n - 1];
        }
    }

    public static void main(String[] args) {
        Solution s = new O0049().new Solution();
        Object ans = s.nthUglyNumber(10);   // 12
        System.out.println(ans);
        ans = s.nthUglyNumber(1352);    // 402653184
        System.out.println(ans);
    }
}