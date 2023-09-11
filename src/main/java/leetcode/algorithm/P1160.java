package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-10 17:45
 * LastEditTime: 2022-07-10 17:45
 * Description: 1160. 拼写单词
 */

public class P1160 {
    // code beginning
    class Solution {
        public int countCharacters(String[] words, String chars) {
            int[] charCount = new int[26];
            for (char c : chars.toCharArray()) {
                charCount[c - 'a']++;
            }

            int count = 0;
            for (String word : words) {
                int[] wordCount = new int[26];
                for (char c : word.toCharArray()) {
                    wordCount[c - 'a']++;
                }
                boolean flag = true;
                for (int i = 0; i < 26; i++) {
                    if (wordCount[i] > charCount[i]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) count += word.length();
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1160().new Solution();
        Object ans = s.countCharacters(new String[]{"hello", "world", "leetcode"}, "welldonehoneyr");
        System.out.println(ans);
    }
}