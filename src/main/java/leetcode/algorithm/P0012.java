package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-20 22:32
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 12. 整数转罗马数字
 */

public class P0012 {
    // code beginning
    class Solution {
        public String intToRoman(int num) {
            int[] base = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < base.length && num > 0; i++) {
                if (num >= base[i]) {
                    builder.append(symbols[i].repeat(num / base[i]));
                    num %= base[i];
                }
            }
            return builder.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P0012().new Solution();
        Object ans = s.intToRoman(58);
        System.out.println(ans);
        ans = s.intToRoman(1994);
        System.out.println(ans);
    }
}