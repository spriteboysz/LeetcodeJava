package algorithm;

import java.util.HashMap;

/**
 * Author: Deean
 * Date: 2022-06-28 22:53
 * LastEditTime: 2022-06-28 22:53
 * Description: 290. 单词规律
 */

public class P0290 {
    // code beginning
    class Solution {
        public boolean wordPattern(String pattern, String s) {
            String[] words = s.split(" ");
            if (pattern.length() != words.length) return false;
            HashMap<Character, String> ch2str = new HashMap<>();
            HashMap<String, Character> str2ch = new HashMap<>();
            for (int i = 0; i < pattern.length(); i++) {
                char ch = pattern.charAt(i);
                String word = words[i];
                if (!ch2str.containsKey(ch)) {
                    ch2str.put(ch, word);
                }
                if (!str2ch.containsKey(word)) {
                    str2ch.put(word, ch);
                }
                if (!ch2str.get(ch).equals(word) || !str2ch.get(word).equals(ch)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0290().new Solution();
        Object ans = s.wordPattern("abba", "dog cat cat dog");
        System.out.println(ans);
        ans = s.wordPattern("abba", "dog cat cat fish");
        System.out.println(ans);
    }
}