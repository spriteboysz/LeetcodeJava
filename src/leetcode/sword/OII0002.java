package leetcode.sword;

/**
 * Author: Deean
 * Date: 2022-08-17 22:51
 * FileName: src/leetcode/editor/cn/leetcode.sword
 * Description: 剑指 Offer II 002. 二进制加法
 */

public class OII0002 {
    // code beginning
    class Solution {
        public String addBinary(String a, String b) {
            int i = a.length() - 1, j = b.length() - 1, carry = 0;
            StringBuilder builder = new StringBuilder();
            while (i >= 0 || j >= 0 || carry != 0) {
                int x = i >= 0 ? a.charAt(i--) - '0' : 0;
                int y = j >= 0 ? b.charAt(j--) - '0' : 0;
                int cur = x + y + carry;
                builder.append(cur % 2);
                carry = cur / 2;
            }
            return builder.reverse().toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0002().new Solution();
        Object ans = s.addBinary("1010", "1011");
        System.out.println(ans);
    }
}