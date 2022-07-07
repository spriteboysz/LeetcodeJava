package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-07 23:14
 * LastEditTime: 2022-07-07 23:14
 * Description: 1935. 可以输入的最大单词数
 */

public class P1935 {
    // code beginning
    class Solution {
        public int canBeTypedWords(String text, String brokenLetters) {
            String[] words = text.split(" ");
            int count = 0;
            for (String word : words) {
                boolean flag = true;
                for (int i = 0; i < brokenLetters.length(); i++) {
                    if (word.contains(String.valueOf(brokenLetters.charAt(i)))) {
                        flag = false;
                        break;
                    }
                }
                if (flag) count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1935().new Solution();
        Object ans = s.canBeTypedWords("leet code", "lt");
        System.out.println(ans);
    }
}