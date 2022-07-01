package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-01 23:17
 * LastEditTime: 2022-07-01 23:17
 * Description: 2255. 统计是给定字符串前缀的字符串数目
 */

public class P2255 {
    // code beginning
    class Solution {
        public int countPrefixes(String[] words, String s) {
            int count = 0;
            for (String word : words) {
                if (s.startsWith(word)) count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2255().new Solution();
        Object ans = s.countPrefixes(new String[]{"a", "b", "c", "ab", "bc", "abc"}, "abc");
        System.out.println(ans);
    }
}