package algorithm;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Author: Deean
 * Date: 2022-08-06 20:33
 * Description: 2273. 移除字母异位词后的结果数组
 */

public class P2273 {
    // code beginning
    class Solution {
        public List<String> removeAnagrams(String[] words) {
            Stack<String> stack = new Stack<>();
            for (String word : words) {
                if (stack.isEmpty() || !isAnagram(stack.peek(), word)) {
                    stack.push(word);
                }
            }
            return new ArrayList<>(stack);
        }

        private boolean isAnagram(String word1, String word2) {
            if (word1.length() != word2.length()) return false;
            int[] alphabet = new int[26];
            for (int i = 0; i < word1.length(); i++) {
                alphabet[word1.charAt(i) - 'a']++;
                alphabet[word2.charAt(i) - 'a']--;
            }
            for (int i = 0; i < 26; i++) {
                if (alphabet[i] != 0) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2273().new Solution();
        Object ans = s.removeAnagrams(new String[]{"abba", "baba", "bbaa", "cd", "cd"});
        System.out.println(ans);
    }
}