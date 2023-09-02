package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-06 08:07
 * Description: 1652. 拆炸弹
 */

public class P1652 {
    // code beginning
    class Solution {
        public int[] decrypt(int[] code, int k) {
            int n = code.length;
            int[] decode = new int[n];
            for (int i = 0; i < n; i++) {
                for (int j = 1; j <= Math.abs(k); j++) {
                    if (k > 0) {
                        decode[i] += code[(n + i + j) % n];
                    } else if (k < 0) {
                        decode[i] += code[(n + i - j) % n];
                    }
                }
            }
            return decode;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1652().new Solution();
        int[] ans = s.decrypt(new int[]{5, 7, 1, 4}, 3);
        System.out.println(Arrays.toString(ans));   // [12, 10, 16, 13]
        ans = s.decrypt(new int[]{1, 2, 3, 4}, 0);
        System.out.println(Arrays.toString(ans));   // [0, 0, 0, 0]
        ans = s.decrypt(new int[]{2, 4, 9, 3}, -2);
        System.out.println(Arrays.toString(ans));   // [12, 5, 6, 13]
    }
}