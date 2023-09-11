package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-14 21:56
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 2047. 句子中的有效单词数
 */

public class P2047 {
    // code beginning
    class Solution {
        public int countValidWords(String sentence) {
            String[] words = sentence.trim().split("\s+");
            int count = 0;
            for (String word : words) {
                if (isValid(word)) count++;
            }
            return count;
        }

        private boolean isValid(String word) {
            boolean hasHyphens = false;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (Character.isDigit(c)) {
                    return false;
                } else if (c == '-') {
                    if (hasHyphens || i == 0 || i == word.length() - 1 || !Character.isLetter(word.charAt(i - 1)) || !Character.isLetter(word.charAt(i + 1))) {
                        return false;
                    }
                    hasHyphens = true;
                } else if (c == '!' || c == '.' || c == ',') {
                    if (i != word.length() - 1) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2047().new Solution();
        Object ans = s.countValidWords(" o6 t");
        System.out.println(ans);
        ans = s.countValidWords("alice and  bob are playing stone-game10");
        System.out.println(ans);
    }
}