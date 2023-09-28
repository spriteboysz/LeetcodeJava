package leetcode.LCP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-27 23:57
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 015. 找到字符串中所有字母异位词
 */

public class LCR0015 {
    // code beginning
    class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            int n = s.length(), m = p.length();
            List<Integer> index = new ArrayList<>();
            if (m > n) return index;
            int[] alphabet1 = new int[26], alphabet2 = new int[26];
            for (int i = 0; i < m; i++) {
                alphabet1[p.charAt(i) - 'a'] += 1;
                alphabet2[s.charAt(i) - 'a'] += 1;
            }
            if (Arrays.equals(alphabet1, alphabet2)) {
                index.add(0);
            }
            for (int i = m; i < n; i++) {
                alphabet2[s.charAt(i - m) - 'a'] -= 1;
                alphabet2[s.charAt(i) - 'a'] += 1;
                if (Arrays.equals(alphabet1, alphabet2)) {
                    index.add(i - m + 1);
                }
            }
            return index;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0015().new Solution();
        var ans = s.findAnagrams("cbaebabacd", "abc");
        System.out.println(ans);
    }
}
