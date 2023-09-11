package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-08-29 19:16
 * FileName: src/leetcode.algorithm
 * Description: 2806. 取整购买后的账户余额
 */

public class P2806 {
    // code beginning
    class Solution {
        public int accountBalanceAfterPurchase(int purchaseAmount) {
            return 100 - (purchaseAmount + 5) / 10 * 10;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2806().new Solution();
        Object ans = s.accountBalanceAfterPurchase(15);
        System.out.println(ans);
    }
}
