package leetcode.algorithm;

/**
 * Author: @Deean
 * Date: 2022-06-23 00:01
 * LastEditTime: 2022-06-23 00:01
 * Description: 找不同
 */

public class P0389 {
    // code beginning
    class Solution {
        public char findTheDifference(String s, String t) {
            char[] sChars = new char[26];
            char[] tChars = new char[26];
            for (int i = 0; i < s.length(); i++) {
                sChars[s.charAt(i) - 97] += 1;
            }
            for (int i = 0; i < t.length(); i++) {
                tChars[t.charAt(i) - 97] += 1;
            }
            for (int i = 0; i < 26; i++) {
                if (tChars[i] - sChars[i] == 1) {
                    return (char) (i + 97);
                }
            }
            return ' ';
        }
    }

    public static void main(String[] args) {
        Solution s = new P0389().new Solution();
        Object ans = s.findTheDifference("abce", "abced");
        System.out.println(ans);
    }
}