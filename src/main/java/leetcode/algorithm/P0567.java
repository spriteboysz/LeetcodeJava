package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-16 11:34
 * FileName: src/main/java/leetcode/algorithm
 * Description:567. 字符串的排列
 */

public class P0567 {
    // code beginning
    class Solution {
        public boolean checkInclusion(String s1, String s2) {
            int n = s1.length(), m = s2.length();
            if (n > m) {
                return false;
            }
            int[] cnt1 = new int[26];
            int[] cnt2 = new int[26];
            for (int i = 0; i < n; ++i) {
                ++cnt1[s1.charAt(i) - 'a'];
                ++cnt2[s2.charAt(i) - 'a'];
            }
            if (Arrays.equals(cnt1, cnt2)) {
                return true;
            }
            for (int i = n; i < m; ++i) {
                ++cnt2[s2.charAt(i) - 'a'];
                --cnt2[s2.charAt(i - n) - 'a'];
                if (Arrays.equals(cnt1, cnt2)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0567().new Solution();
        var ans = s.checkInclusion("ab", "eidbaooo");
        System.out.println(ans);
    }
}
