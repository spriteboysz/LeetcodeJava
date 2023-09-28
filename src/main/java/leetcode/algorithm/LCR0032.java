package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-28 23:56
 * FileName: src/main/java/leetcode/algorithm
 * Description:LCR 032. 有效的字母异位词
 */

public class LCR0032 {
    // code beginning
    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length() || s.equals(t)) return false;
            int[] alphabet = new int[26];
            for (int i = 0; i < s.length(); i++) {
                alphabet[s.charAt(i) - 'a'] += 1;
                alphabet[t.charAt(i) - 'a'] -= 1;
            }
            for (int i = 0; i < 26; i++) {
                if (alphabet[i] != 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0032().new Solution();
        var ans = s.isAnagram("anagram", "nagaram");
        System.out.println(ans);
    }
}
