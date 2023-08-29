package algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-08-05 22:53
 * Description: 888. 公平的糖果交换
 */

public class P0888 {
    // code beginning
    class Solution {
        public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
            int aliceSum = 0, bobSum = 0;
            for (int a : aliceSizes) aliceSum += a;
            for (int b : bobSizes) bobSum += b;
            int delta = (aliceSum - bobSum) / 2;

            Set<Integer> set = new HashSet<>();
            for (int a : aliceSizes) set.add(a);
            for (int b : bobSizes) {
                if (set.contains(b + delta)) {
                    return new int[]{b + delta, b};
                }
            }
            return new int[]{};
        }
    }

    public static void main(String[] args) {
        Solution s = new P0888().new Solution();
        int[] ans = s.fairCandySwap(new int[]{1, 2}, new int[]{2, 3});
        System.out.println(Arrays.toString(ans));
    }
}