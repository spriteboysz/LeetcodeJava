package leetcode.algorithm;

/**
 * Author: @Deean
 * Date: 2022-06-24 20:58
 * LastEditTime: 2022-06-24 20:58
 * Description: 反转字符串中的单词 III
 */

public class P0557 {
    // code beginning
    class Solution {
        public String reverseWords(String s) {
            String[] words = s.split("\\s+");
            for (int i = 0; i < words.length; i++) {
                StringBuilder sb = new StringBuilder(words[i]);
                words[i] = sb.reverse().toString();
            }
            StringBuilder sb = new StringBuilder();
            for (String word : words) {
                sb.append(word).append(" ");
            }
            return sb.toString().trim();
        }
    }

    public static void main(String[] args) {
        Solution s = new P0557().new Solution();
        Object ans = s.reverseWords("Let's take LeetCode contest");
        System.out.println(ans);
        ans = s.reverseWords("God Ding");
        System.out.println(ans);
    }
}