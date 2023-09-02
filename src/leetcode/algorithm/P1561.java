package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-10 21:38
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 1561. 你可以获得的最大硬币数目
 */

public class P1561 {
    // code beginning
    class Solution {
        public int maxCoins(int[] piles) {
            Arrays.sort(piles);
            int n = piles.length, coins = 0;
            for (int i = n - 2; i >= n / 3; i -= 2) {
                coins += piles[i];
            }
            return coins;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1561().new Solution();
        Object ans = s.maxCoins(new int[]{2, 4, 1, 2, 7, 8});
        System.out.println(ans);
    }
}