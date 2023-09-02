package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-10 18:06
 * LastEditTime: 2022-07-10 18:06
 * Description: 806. 写字符串需要的行数
 */

public class P0806 {
    // code beginning
    class Solution {
        public int[] numberOfLines(int[] widths, String s) {
            int lines = 1, width = 0;
            for (char c : s.toCharArray()) {
                int need = widths[c - 'a'];
                width += need;
                if (width > 100) {
                    lines++;
                    width = need;
                }
            }
            return new int[]{lines, width};
        }
    }

    public static void main(String[] args) {
        Solution s = new P0806().new Solution();
        int[] ans = s.numberOfLines(new int[]{4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                10, 10, 10, 10, 10, 10, 10}, "bbbcccdddaaa");
        System.out.println(Arrays.toString(ans));
    }
}