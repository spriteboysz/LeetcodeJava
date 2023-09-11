package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-06 23:53
 * FileName: src/leetcode/algorithm
 * Description:2595. 奇偶位数
 */

public class P2595 {
    // code beginning
    class Solution {
        public int[] evenOddBit(int n) {
            var bits = new int[2];
            for (int i = 0; n > 0; i ^= 1, n >>= 1)
                bits[i] += n & 1;
            return bits;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2595().new Solution();
        var ans = s.evenOddBit(17);
        System.out.println(Arrays.toString(ans));
    }
}
