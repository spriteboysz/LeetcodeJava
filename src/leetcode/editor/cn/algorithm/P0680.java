package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-19 22:58
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 680. 验证回文字符串 Ⅱ
 */

public class P0680 {
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
                    return validPalindrome(s, left, right - 1) || validPalindrome(s, left + 1, right);
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
        Solution s = new P0680().new Solution();
        Object ans = s.validPalindrome("abca");
        System.out.println(ans);
    }
}