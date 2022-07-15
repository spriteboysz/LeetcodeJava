package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-15 23:47
 * LastEditTime: 2022-07-15 23:47
 * Description: 1455. 检查单词是否为句中其他单词的前缀
 */

public class P1455 {
    // code beginning
    class Solution {
        public int isPrefixOfWord(String sentence, String searchWord) {
            String[] words = sentence.split(" ");
            for (int i = 0; i < words.length; i++) {
                if (words[i].startsWith(searchWord)) return i + 1;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1455().new Solution();
        Object ans = s.isPrefixOfWord("this problem is an easy problem", "pro");
        System.out.println(ans);
    }
}