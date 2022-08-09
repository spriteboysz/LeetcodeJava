package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-09 23:33
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 392. 判断子序列
 */

public class P0392 {
    // code beginning
    class Solution {
        public boolean isSubsequence(String s, String t) {
            if (s.length() == 0) return true;
            for (int i = 0, j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    i++;
                }
                if (i == s.length()) return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0392().new Solution();
        Object ans = s.isSubsequence("abc", "ahbgdc");
        System.out.println(ans);
        ans = s.isSubsequence("abx", "ahbgdc");
        System.out.println(ans);
    }
}