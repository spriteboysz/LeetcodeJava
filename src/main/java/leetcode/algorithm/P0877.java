package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-26 23:28
 * LastEditTime: 2022-07-26 23:28
 * Description: 877. 石子游戏
 */

public class P0877 {
    // code beginning
    class Solution {
        public boolean stoneGame(int[] piles) {
            return piles.length != 0;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0877().new Solution();
        Object ans = s.stoneGame(new int[]{3, 7, 2, 3});
        System.out.println(ans);
    }
}