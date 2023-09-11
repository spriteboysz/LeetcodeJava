package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-02 22:27
 * LastEditTime: 2022-07-02 22:27
 * Description: 1844. 将所有数字用字符替换
 */

public class P1844 {
    // code beginning
    class Solution {
        public String replaceDigits(String s) {
            int n = s.length();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length() - 1; i += 2) {
                char c = s.charAt(i), num = s.charAt(i + 1);
                sb.append(c);
                sb.append((char) (c + num - '0'));
            }
            if (n % 2 == 1) sb.append(s.charAt(n - 1));
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P1844().new Solution();
        Object ans = s.replaceDigits("a1b2c3d4e");
        System.out.println(ans);
    }
}