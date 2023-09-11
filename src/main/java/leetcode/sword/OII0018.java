package leetcode.sword;

/**
 * Author: Deean
 * Date: 2022-07-29 23:39
 * LastEditTime: 2022-07-29 23:39
 * Description: 剑指 Offer II 018. 有效的回文
 */

public class OII0018 {
    // code beginning
    class Solution {
        public boolean isPalindrome(String s) {
            StringBuilder builder = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (Character.isLetterOrDigit(c)) {
                    builder.append(Character.toLowerCase(c));
                }
            }
            return builder.toString().contentEquals(builder.reverse());
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0018().new Solution();
        Object ans = s.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(ans);
    }
}