package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-06-26 22:48
 * LastEditTime: 2022-06-26 22:48
 * Description: .
 */

public class P0242 {
    // code beginning
    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) return false;
            int[] chars = new int[26];
            for (int i = 0; i < s.length(); i++) {
                chars[s.charAt(i) - 'a']++;
                chars[t.charAt(i) - 'a']--;
            }
            for (int count : chars) {
                if (count != 0) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0242().new Solution();
        Object ans = s.isAnagram("anagram", "nagaram");
        System.out.println(ans);
    }
}