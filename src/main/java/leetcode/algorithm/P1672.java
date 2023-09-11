package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-06-29 22:11
 * LastEditTime: 2022-06-29 22:11
 * Description: 1672. 最富有客户的资产总量
 */

public class P1672 {
    // code beginning
    class Solution {
        public int maximumWealth(int[][] accounts) {
            int max = 0;
            for (int[] account : accounts) {
                int cur = 0;
                for (int el : account) {
                    cur += el;
                }
                if (cur > max) max = cur;
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1672().new Solution();
        Object ans = s.maximumWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}});
        System.out.println(ans);
    }
}