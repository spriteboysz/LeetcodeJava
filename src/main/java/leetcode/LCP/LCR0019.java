package leetcode.LCP;

/**
 * Author: Deean
 * Date: 2023-09-28 22:18
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 019. 验证回文串 II
 */

public class LCR0019 {
    // code beginning
    class Solution {
        public boolean check(String s) {
            for (int i = 0, n = s.length(); i < n / 2; i++) {
                if (s.charAt(i) != s.charAt(n - 1 - i)) {
                    return false;
                }
            }
            return true;
        }

        public boolean validPalindrome(String s) {
            for (int i = 0, n = s.length(); i < n / 2; i++) {
                if (s.charAt(i) != s.charAt(n - 1 - i)) {
                    return check(s.substring(0, i) + s.substring(i + 1)) ||
                            check(s.substring(0, n - 1 - i) + s.substring(n - i));
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0019().new Solution();
        var ans = s.validPalindrome("abac");
        System.out.println(ans);
    }
}
