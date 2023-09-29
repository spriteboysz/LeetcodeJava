package leetcode.LCP;

/**
 * Author: Deean
 * Date: 2023-09-28 22:03
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 018. 验证回文串
 */

public class LCR0018 {
    // code beginning
    class Solution {
        public boolean isPalindrome(String s) {
            StringBuilder ss = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (Character.isLetterOrDigit(c)) {
                    ss.append(Character.toLowerCase(c));
                }
            }
            return ss.toString().contentEquals(ss.reverse());
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0018().new Solution();
        var ans = s.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(ans);
    }
}
