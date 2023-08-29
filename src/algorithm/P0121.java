package algorithm;

/**
 * Author: Deean
 * Date: 2022-08-09 23:51
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 121. 买卖股票的最佳时机
 */

public class P0121 {
    // code beginning
    class Solution {
        public int maxProfit(int[] prices) {
            int curMin = Integer.MAX_VALUE, profit = 0;
            for (int price : prices) {
                curMin = Math.min(curMin, price);
                profit = Math.max(profit, price - curMin);
            }
            return profit;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0121().new Solution();
        Object ans = s.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println(ans);
    }
}