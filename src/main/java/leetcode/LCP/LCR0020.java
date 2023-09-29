package leetcode.LCP;

/**
 * Author: Deean
 * Date: 2023-09-28 22:49
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 020. 回文子串
 */

public class LCR0020 {
    // code beginning
    class Solution {
        public int countSubstrings(String s) {
            int cnt = 0;
            for (int i = 0, n = s.length(); i < 2 * n - 1; i++) {
                int left = i / 2, right = i / 2 + i % 2;
                while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                    left--;
                    right++;
                    cnt++;
                }
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0020().new Solution();
        var ans = s.countSubstrings("aaa");
        System.out.println(ans);
    }
}
