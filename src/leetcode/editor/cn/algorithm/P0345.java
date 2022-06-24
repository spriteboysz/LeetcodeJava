package leetcode.editor.cn.algorithm;

import java.util.ArrayList;

/**
 * Author: @Deean
 * Date: 2022-06-24 22:07
 * LastEditTime: 2022-06-24 22:07
 * Description: 345. 反转字符串中的元音字母
 */

public class P0345 {
    // code beginning
    class Solution {
        private final char[] VOWELS = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        public String reverseVowels(String s) {
            ArrayList<Character> list = new ArrayList<>();
            for (char c : VOWELS) {
                list.add(c);
            }
            StringBuilder vowel = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (list.contains(c)) {
                    vowel.append(c);
                }
            }
            String vowel2 = vowel.reverse().toString();
            StringBuilder str = new StringBuilder();
            for (int i = 0, j = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (list.contains(c)) {
                    str.append(vowel2.charAt(j++));
                } else {
                    str.append(c);
                }
            }
            return str.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P0345().new Solution();
        Object ans = s.reverseVowels("hello");
        System.out.println(ans);
    }
}