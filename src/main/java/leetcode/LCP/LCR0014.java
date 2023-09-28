package leetcode.LCP;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-27 23:45
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 014. 字符串的排列
 */

public class LCR0014 {
    // code beginning
    class Solution {
        public boolean checkInclusion(String s1, String s2) {
            int m = s1.length(), n = s2.length();
            if (m > n) return false;
            int[] alphabet1 = new int[26], alphabet2 = new int[26];
            for (int i = 0; i < m; i++) {
                alphabet1[s1.charAt(i) - 'a'] += 1;
                alphabet2[s2.charAt(i) - 'a'] += 1;
            }
            if (Arrays.equals(alphabet1, alphabet2)) {
                return true;
            }
            for (int i = m; i < n; i++) {
                alphabet2[s2.charAt(i - m) - 'a'] -= 1;
                alphabet2[s2.charAt(i) - 'a'] += 1;
                if (Arrays.equals(alphabet1, alphabet2)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0014().new Solution();
        var ans = s.checkInclusion("ab", "eidbaooo");
        System.out.println(ans);
    }
}
