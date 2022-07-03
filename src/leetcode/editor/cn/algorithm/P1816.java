package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-03 23:58
 * LastEditTime: 2022-07-03 23:58
 * Description: 1816. 截断句子
 */

public class P1816 {
    // code beginning
    class Solution {
        public String truncateSentence(String s, int k) {
            String[] words = s.split(" ");
            if (k >= words.length) return s;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < k; i++) {
                sb.append(words[i]).append(" ");
            }
            return sb.toString().trim();
        }
    }

    public static void main(String[] args) {
        Solution s = new P1816().new Solution();
        Object ans = s.truncateSentence("What is the solution to this problem", 4);
        System.out.println(ans);
    }
}