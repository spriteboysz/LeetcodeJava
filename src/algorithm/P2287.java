package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-24 22:41
 * LastEditTime: 2022-07-24 22:41
 * Description: 2287. 重排字符形成目标字符串
 */

public class P2287 {
    // code beginning
    class Solution {
        public int rearrangeCharacters(String s, String target) {
            int[] sAlphabet = new int[26], tAlphabet = new int[26];
            for (char c : s.toCharArray()) {
                sAlphabet[c - 'a']++;
            }
            for (char c : target.toCharArray()) {
                tAlphabet[c - 'a']++;
            }
            int min = s.length() + 1;
            for (int i = 0; i < 26; i++) {
                if (tAlphabet[i] != 0) {
                    min = Math.min(min, sAlphabet[i] / tAlphabet[i]);
                }
            }
            return min;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2287().new Solution();
        Object ans = s.rearrangeCharacters("abbaccaddaeea", "aaaaa");
        System.out.println(ans);
    }
}