package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-25 23:51
 * LastEditTime: 2022-07-25 23:51
 * Description: 2351. 第一个出现两次的字母
 */

public class P2351 {
    // code beginning
    class Solution {
        public char repeatedCharacter(String s) {
            int[] alphabet = new int[26];
            for (char c : s.toCharArray()) {
                alphabet[c - 'a']++;
                if (alphabet[c - 'a'] == 2) return c;
            }
            return '0';
        }
    }

    public static void main(String[] args) {
        Solution s = new P2351().new Solution();
        Object ans = s.repeatedCharacter("abcdd");
        System.out.println(ans);
    }
}