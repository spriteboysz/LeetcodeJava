package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-09 23:14
 * LastEditTime: 2022-07-09 23:14
 * Description: 1768. 交替合并字符串
 */

public class P1768 {
    // code beginning
    class Solution {
        public String mergeAlternately(String word1, String word2) {
            StringBuilder builder = new StringBuilder();
            int index = 0;
            while (index < word1.length() && index < word2.length()) {
                builder.append(word1.charAt(index));
                builder.append(word2.charAt(index++));
            }
            if (index < word1.length()) {
                builder.append(word1.substring(index));
            }
            if (index < word2.length()) {
                builder.append(word2.substring(index));
            }
            return builder.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P1768().new Solution();
        Object ans = s.mergeAlternately("ab", "pqrs");
        System.out.println(ans);
    }
}