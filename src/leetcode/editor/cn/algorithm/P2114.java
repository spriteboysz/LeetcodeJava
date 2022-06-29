package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-06-29 23:04
 * LastEditTime: 2022-06-29 23:04
 * Description: 2114. 句子中的最多单词数
 */

public class P2114 {
    // code beginning
    class Solution {
        public int mostWordsFound(String[] sentences) {
            int count = 0;
            for (String sentence : sentences) {
                int cur = sentence.trim().split(" ").length;
                if (cur > count) count = cur;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2114().new Solution();
        Object ans = s.mostWordsFound(new String[]{"please wait", "continue to fight", "continue to win"});
        System.out.println(ans);
    }
}