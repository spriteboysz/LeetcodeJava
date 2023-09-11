package leetcode.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-06-27 22:45
 * LastEditTime: 2022-06-27 22:45
 * Description: 819. 最常见的单词
 */

public class P0819 {
    // code beginning
    class Solution {
        public String mostCommonWord(String paragraph, String[] banned) {
            HashMap<String, Integer> count = new HashMap<>();
            String[] words = paragraph.trim().toLowerCase().split("[^a-zA-Z]+");
            for (String word : words) {
                if (!Arrays.asList(banned).contains(word)) {
                    count.put(word, count.getOrDefault(word, 0) + 1);
                }
            }

            Map.Entry<String, Integer> max = null;
            for (Map.Entry<String, Integer> entry : count.entrySet()) {
                if (max == null || entry.getValue() > max.getValue()) {
                    max = entry;
                }
            }
            return max != null ? max.getKey() : null;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0819().new Solution();
        Object ans = s.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",
                new String[]{"hit"});
        System.out.println(ans);
    }
}