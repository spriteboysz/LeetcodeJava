package leetcode.LCP;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-27 22:24
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 003. 比特位计数
 */

public class LCR0003 {
    // code beginning
    class Solution {
        public int[] countBits(int n) {
            int[] bins = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                int cnt = 0, num = i;
                while (num > 0) {
                    cnt += num & 1;
                    num >>= 1;
                }
                bins[i] = cnt;
            }
            return bins;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0003().new Solution();
        var ans = s.countBits(10);
        System.out.println(Arrays.toString(ans));
    }
}
