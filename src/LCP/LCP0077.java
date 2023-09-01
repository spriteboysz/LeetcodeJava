package LCP;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-08-29 17:42
 * FileName: src/LCP
 * Description:LCP 77. 符文储备
 */

public class LCP0077 {
    // code beginning
    class Solution {
        public int runeReserve(int[] runes) {
            Arrays.sort(runes);
            int maximum = 1, cur = 1;
            for (int i = 1; i < runes.length; i++) {
                if (runes[i] - runes[i - 1] <= 1) {
                    cur++;
                    maximum = Math.max(maximum, cur);
                } else {
                    cur = 1;
                }
            }
            return maximum;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCP0077().new Solution();
        Object ans = s.runeReserve(new int[]{1, 1, 3, 3, 2, 4});
        System.out.println(ans);
    }
}
