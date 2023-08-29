package algorithm;

/**
 * Author: @Deean
 * Date: 2022-06-24 22:51
 * LastEditTime: 2022-06-24 22:51
 * Description: 190. 颠倒二进制位
 */

public class P0190 {
    // code beginning
    class Solution {
        public int reverseBits(int n) {
            if (n == 0) return 0;
            int reverse = 0;
            for (int i = 0; i < 32; i++) {
                reverse += (n & 1) << (31 - i);
                n >>= 1;
            }
            return reverse;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0190().new Solution();
        Object ans = s.reverseBits(43261596);  // 964176192
        System.out.println(ans);
    }
}