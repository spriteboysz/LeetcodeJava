package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-02 19:37
 * FileName: src/leetcode/algorithm
 * Description:2706. 购买两块巧克力
 */

public class P2706 {
    // code beginning
    class Solution {
        public int buyChoco(int[] prices, int money) {
            Arrays.sort(prices);
            return money >= prices[0] + prices[1] ? money - prices[0] - prices[1] : money;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2706().new Solution();
        Object ans = s.buyChoco(new int[]{1, 2, 2}, 3);
        System.out.println(ans);
    }
}
