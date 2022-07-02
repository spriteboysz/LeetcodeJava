package leetcode.editor.cn.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-02 22:56
 * LastEditTime: 2022-07-02 22:56
 * Description: 338. 比特位计数
 */

public class P0338 {
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
        Solution s = new P0338().new Solution();
        int[] ans = s.countBits(5);
        System.out.println(Arrays.toString(ans));
    }
}