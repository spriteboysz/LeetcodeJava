package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-02 19:41
 * FileName: src/leetcode/algorithm
 * Description:2697. 字典序最小回文串
 */

public class P2697 {
    // code beginning
    class Solution {
        public String makeSmallestPalindrome(String s) {
            StringBuilder ss = new StringBuilder();
            int n = s.length();
            for (int i = 0; i < n / 2; i++) {
                ss.append((char) Math.min(s.charAt(i), s.charAt(n - 1 - i)));
            }
            String mid = n % 2 == 0 ? "" : String.valueOf(s.charAt(n / 2));
            return ss.toString() + mid + ss.reverse();
        }
    }

    public static void main(String[] args) {
        Solution s = new P2697().new Solution();
        Object ans = s.makeSmallestPalindrome("seven");
        System.out.println(ans);
    }
}
