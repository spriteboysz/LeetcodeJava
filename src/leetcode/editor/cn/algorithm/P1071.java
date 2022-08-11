package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-11 21:26
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1071. 字符串的最大公因子
 */

public class P1071 {
    // code beginning
    class Solution {
        public String gcdOfStrings(String str1, String str2) {
            if (!str1.concat(str2).equals(str2.concat(str1))) return "";
            return str1.substring(0, gcd(str1.length(), str2.length()));
        }

        private int gcd(int a, int b) {
            int remainder = a % b;
            while (remainder != 0) {
                a = b;
                b = remainder;
                remainder = a % b;
            }
            return b;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1071().new Solution();
        Object ans = s.gcdOfStrings("ABC", "ABCABC");
        System.out.println(ans);
        ans = s.gcdOfStrings("ABAB", "ABABAB");
        System.out.println(ans);
    }
}