package leetcode.editor.cn.algorithm;

/**
 * Author: @Deean
 * Date: 2022-06-25 22:08
 * LastEditTime: 2022-06-25 22:08
 * Description: 58. 最后一个单词的长度
 */

public class P0058 {
    // code beginning
    class Solution {
        public int lengthOfLastWord(String s) {
            s = s.trim();
            int count = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == ' ') return count;
                count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0058().new Solution();
        Object ans = s.lengthOfLastWord("Hello World");
        System.out.println(ans);
        ans = s.lengthOfLastWord("   fly me   to   the moon  ");
        System.out.println(ans);
        ans = s.lengthOfLastWord("y");
        System.out.println(ans);
    }
}