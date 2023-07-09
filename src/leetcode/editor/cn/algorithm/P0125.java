package leetcode.editor.cn.algorithm;

/**
 * Author: @Deean
 * Date: 2022-06-22 22:17
 * LastEditTime: 2022-06-22 22:17
 * Description: 验证回文串
 */

public class P0125 {
    // code beginning
    class Solution {
        public boolean isPalindrome(String s) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (Character.isLetterOrDigit(ch)) {
                    sb.append(Character.toLowerCase(ch));
                }
            }

            StringBuilder s_rev = new StringBuilder(sb).reverse();
            return sb.toString().contentEquals(s_rev);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0125().new Solution();
        boolean ans = s.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(ans);
    }
}