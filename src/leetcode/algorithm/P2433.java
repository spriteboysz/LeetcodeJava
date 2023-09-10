package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-08 22:46
 * FileName: src/leetcode/algorithm
 * Description:2433. 找出前缀异或的原始数组
 */

public class P2433 {
    // code beginning
    class Solution {
        public int[] findArray(int[] pref) {
            int[] xor = new int[pref.length];
            xor[0] = pref[0];
            for (int i = 1; i < pref.length; i++) {
                xor[i] = pref[i - 1] ^ pref[i];
            }
            return xor;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2433().new Solution();
        var ans = s.findArray(new int[]{5, 2, 0, 3, 1});
        System.out.println(Arrays.toString(ans));
    }
}
