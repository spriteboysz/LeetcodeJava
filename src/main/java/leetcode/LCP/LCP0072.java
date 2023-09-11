package leetcode.LCP;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-08-29 16:50
 * FileName: src/leetcode.LCP
 * Description:leetcode.LCP 72. 补给马车
 */

public class LCP0072 {
    // code beginning
    class Solution {
        public int[] supplyWagon(int[] supplies) {
            int n = supplies.length;
            for (int i = 0; i < (n + 1) / 2; i++) {
                int minimum = Integer.MAX_VALUE, index = -1;
                for (int j = 0; j < n - 1 - i; j++) {
                    int merge = supplies[j] + supplies[j + 1];
                    if (merge < minimum) {
                        minimum = merge;
                        index = j;
                    }
                }
                supplies[index] = minimum;
                System.arraycopy(supplies, index + 1 + 1, supplies, index + 1, n - 1 - i - (index + 1));
            }
            return Arrays.copyOf(supplies, n / 2);
        }
    }

    public static void main(String[] args) {
        Solution s = new LCP0072().new Solution();
        Object ans = s.supplyWagon(new int[]{7, 3, 6, 1, 8});
        System.out.println(Arrays.toString((int[]) ans));
    }
}
