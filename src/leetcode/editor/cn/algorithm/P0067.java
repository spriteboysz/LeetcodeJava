package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-31 17:29
 * LastEditTime: 2022-07-31 17:29
 * Description: 67. 二进制求和
 */

public class P0067 {
    // code beginning
    class Solution {
        public String addBinary(String a, String b) {
            StringBuilder builder = new StringBuilder();
            int n = Math.max(a.length(), b.length()), carry = 0;
            for (int i = 0; i < n; ++i) {
                carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
                carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
                builder.append((char) (carry % 2 + '0'));
                carry /= 2;
            }
            if (carry > 0) builder.append('1');
            return builder.reverse().toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P0067().new Solution();
        Object ans = s.addBinary("11", "1");
        System.out.println(ans);
    }
}