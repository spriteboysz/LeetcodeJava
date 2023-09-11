package leetcode.sword;

/**
 * Author: Deean
 * Date: 2022-08-19 23:41
 * FileName: src/leetcode/editor/cn/leetcode.sword
 * Description: 剑指 Offer II 019. 最多删除一个字符得到回文
 */

public class OII0019 {
    // code beginning
    class Solution {
        public boolean validPalindrome(String s) {
            int left = 0, right = s.length() - 1;
            while (left < right) {
                char c1 = s.charAt(left), c2 = s.charAt(right);
                if (c1 == c2) {
                    left++;
                    right--;
                } else {
                    return validPalindrome(s, left + 1, right) || validPalindrome(s, left, right - 1);
                }
            }
            return true;
        }

        public boolean validPalindrome(String s, int left, int right) {
            for (int i = left, j = right; i < j; i++, j--) {
                char c1 = s.charAt(i), c2 = s.charAt(j);
                if (c1 != c2) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0019().new Solution();
        Object ans = s.validPalindrome("abca");
        System.out.println(ans);
    }
}