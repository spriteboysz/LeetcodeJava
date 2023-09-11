package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-24 23:37
 * LastEditTime: 2022-07-24 23:37
 * Description: 1897. 重新分配字符使所有字符串都相等
 */

public class P1897 {
    // code beginning
    class Solution {
        public boolean makeEqual(String[] words) {
            int[] alphabet = new int[26];
            for (String word : words) {
                for (char c : word.toCharArray()) {
                    alphabet[c - 'a']++;
                }
            }
            for (int i = 0; i < 26; i++) {
                if (alphabet[i] % words.length != 0) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1897().new Solution();
        Object ans = s.makeEqual(new String[]{"ab", "a"});
        System.out.println(ans);
    }
}