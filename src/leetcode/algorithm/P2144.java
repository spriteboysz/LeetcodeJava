package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-07 17:20
 * Description: 2144. 打折购买糖果的最小开销
 */

public class P2144 {
    // code beginning
    class Solution {
        public int minimumCost(int[] cost) {
            Arrays.sort(cost);
            int minCost = 0, i = cost.length - 1;
            while (i >= 0) {
                minCost += cost[i--];
                if (i >= 0) minCost += cost[i--];
                i--;
            }
            return minCost;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2144().new Solution();
        Object ans = s.minimumCost(new int[]{6, 5, 7, 9, 2, 2});
        System.out.println(ans);
    }
}