package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-13 21:53
 * FileName: src/main/java/leetcode/algorithm
 * Description:1475. 商品折扣后的最终价格
 */

public class P1475 {
    // code beginning
    class Solution {
        public int[] finalPrices(int[] prices) {
            for (int i = 0, n = prices.length; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (prices[i] >= prices[j]) {
                        prices[i] -= prices[j];
                        break;
                    }
                }
            }
            return prices;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1475().new Solution();
        var ans = s.finalPrices(new int[]{8, 4, 6, 2, 3});
        System.out.println(Arrays.toString(ans));
    }
}
