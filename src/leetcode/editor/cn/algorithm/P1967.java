package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-01 23:57
 * LastEditTime: 2022-07-01 23:57
 * Description: 1967. 作为子字符串出现在单词中的字符串数目
 */

public class P1967 {
    // code beginning
    class Solution {
        public int numOfStrings(String[] patterns, String word) {
            int count = 0;
            for (String pattern : patterns) {
                if (word.contains(pattern)) count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1967().new Solution();
        Object ans = s.numOfStrings(new String[]{"a", "b", "c"}, "aaaabbbb");
        System.out.println(ans);
    }
}