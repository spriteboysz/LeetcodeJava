package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-01 23:53
 * LastEditTime: 2022-07-01 23:53
 * Description: 2185. 统计包含给定前缀的字符串
 */

public class P2185 {
    // code beginning
    class Solution {
        public int prefixCount(String[] words, String pref) {
            int count = 0;
            for (String word : words) {
                if (word.startsWith(pref)) count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2185().new Solution();
        Object ans = s.prefixCount(new String[]{"pay", "attention", "practice", "attend"}, "at");
        System.out.println(ans);
    }
}