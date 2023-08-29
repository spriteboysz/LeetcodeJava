package algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-05 23:18
 * Description: 1103. 分糖果 II
 */

public class P1103 {
    // code beginning
    class Solution {
        public int[] distributeCandies(int candies, int n) {
            int[] distribute = new int[n];
            for (int i = 0; candies > 0; i++) {
                distribute[i % n] += Math.min(i + 1, candies);
                candies -= (i + 1);
            }
            return distribute;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1103().new Solution();
        int[] ans = s.distributeCandies(10, 3);
        System.out.println(Arrays.toString(ans));
    }
}