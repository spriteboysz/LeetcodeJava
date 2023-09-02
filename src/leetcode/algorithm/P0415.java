package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-16 23:25
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 415. 字符串相加
 */

public class P0415 {
    // code beginning
    class Solution {
        public String addStrings(String num1, String num2) {
            StringBuilder builder = new StringBuilder();
            int carry = 0, index1 = num1.length() - 1, index2 = num2.length() - 1;
            while (index1 >= 0 || index2 >= 0 || carry > 0) {
                int x = index1 >= 0 ? num1.charAt(index1--) - '0' : 0;
                int y = index2 >= 0 ? num2.charAt(index2--) - '0' : 0;
                int cur = x + y + carry;
                builder.append(cur % 10);
                carry = cur / 10;
            }
            return builder.reverse().toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P0415().new Solution();
        Object ans = s.addStrings("456", "77");
        System.out.println(ans);
    }
}