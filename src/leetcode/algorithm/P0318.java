package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-29 22:15
 * LastEditTime: 2022-07-29 22:15
 * Description: 318. 最大单词长度乘积
 */

public class P0318 {
    // code beginning
    class Solution {
        public int maxProduct(String[] words) {
            int[] alphabet = new int[words.length];
            for (int i = 0; i < words.length; i++) {
                for (char c : words[i].toCharArray()) {
                    alphabet[i] |= 1 << (c - 'a');
                }
            }

            int max = 0;
            for (int i = 0; i < words.length - 1; i++) {
                for (int j = i + 1; j < words.length; j++) {
                    if ((alphabet[i] & alphabet[j]) == 0) {
                        max = Math.max(max, words[i].length() * words[j].length());
                    }
                }
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0318().new Solution();
        Object ans = s.maxProduct(new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"});
        System.out.println(ans);
    }
}