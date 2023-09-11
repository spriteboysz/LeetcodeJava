package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-06 22:46
 * Description: 2335. 装满杯子需要的最短总时长
 */

public class P2335 {
    // code beginning
    class Solution {
        public int fillCups(int[] amount) {
            Arrays.sort(amount);
            if (amount[2] >= amount[0] + amount[1]) {
                return amount[2];
            }
            return (amount[0] + amount[1] + amount[2] + 1) / 2;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2335().new Solution();
        Object ans = s.fillCups(new int[]{5, 4, 4});
        System.out.println(ans);
    }
}