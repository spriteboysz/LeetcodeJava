package leetcode.LCP;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-30 17:19
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 135. 报数
 */

public class LCR0135 {
    // code beginning
    class Solution {
        public int[] countNumbers(int cnt) {
            int n = (int) Math.pow(10, cnt) - 1;
            int[] count = new int[n];
            for (int i = 0; i < n; i++) {
                count[i] = i + 1;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0135().new Solution();
        var ans = s.countNumbers(2);
        System.out.println(Arrays.toString(ans));
    }
}
