package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-17 21:58
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 459. 重复的子字符串
 */

public class P0459 {
    // code beginning
    class Solution {
        public boolean repeatedSubstringPattern(String s) {
            String t = s + s;
            return t.substring(1, t.length() - 1).contains(s);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0459().new Solution();
        Object ans = s.repeatedSubstringPattern("abcabcabcabc");
        System.out.println(ans);
    }
}