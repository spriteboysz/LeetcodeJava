package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-16 20:16
 * FileName: src/main/java/leetcode/algorithm
 * Description:14. 最长公共前缀
 */

public class P0014 {
    // code beginning
    class Solution {
        private String process(String s1, String s2) {
            int n1 = s1.length(), n2 = s2.length();
            for (int i = 0, n = Math.min(n1, n2); i < n; i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return s1.substring(0, i);
                }
            }
            return n1 <= n2 ? s1 : s2;
        }

        public String longestCommonPrefix(String[] strs) {
            String common = strs[0];
            for (String str : strs) {
                common = process(common, str);
                // System.out.println(common);
            }
            return common;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0014().new Solution();
        var ans = s.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        System.out.println(ans);
    }
}
