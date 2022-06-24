package leetcode.editor.cn.algorithm;

/**
 * Author: @Deean
 * Date: 2022-06-24 22:27
 * LastEditTime: 2022-06-24 22:27
 * Description: 2000. 反转单词前缀
 */

public class P2000 {
    // code beginning
    class Solution {
        public String reversePrefix(String word, char ch) {
            int index = word.indexOf(ch);
            if (index < 0) return word;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <= index; i++) {
                sb.append(word.charAt(i));
            }
            sb.reverse();
            for (int i = index + 1; i < word.length(); i++) {
                sb.append(word.charAt(i));
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P2000().new Solution();
        Object ans = s.reversePrefix("abcdefd", 'd');
        System.out.println(ans);
    }
}