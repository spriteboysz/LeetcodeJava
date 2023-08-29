package LCP;

/**
 * Author: Deean
 * Date: 2022-07-01 21:51
 * LastEditTime: 2022-07-01 21:51
 * Description: LCP 06. 拿硬币
 */

public class LCP0006 {
    // code beginning
    class Solution {
        public int minCount(int[] coins) {
            int count = 0;
            for (int coin : coins) {
                count += (coin + 1) / 2;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCP0006().new Solution();
        Object ans = s.minCount(new int[]{2, 3, 10});
        System.out.println(ans);
    }
}