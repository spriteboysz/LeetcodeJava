package sword;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-03 16:20
 * LastEditTime: 2022-07-03 16:20
 * Description: 剑指 Offer II 003. 前 n 个数字二进制中 1 的个数
 */

public class OII0003 {
    // code beginning
    class Solution {
        public int[] countBits(int n) {
            int[] bits = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                String s = Integer.toBinaryString(i);
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == '1') bits[i]++;
                }
            }
            return bits;
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0003().new Solution();
        int[] ans = s.countBits(5);
        System.out.println(Arrays.toString(ans));
    }
}