package leetcode.editor.cn.algorithm;

import java.util.HashMap;

/**
 * Author: Deean
 * Date: 2022-07-05 23:43
 * LastEditTime: 2022-07-05 23:43
 * Description: 2085. 统计出现过一次的公共字符串
 */

public class P2085 {
    // code beginning
    class Solution {
        public int countWords(String[] words1, String[] words2) {
            HashMap<String, Integer> count1 = new HashMap<>(), count2 = new HashMap<>();
            for (String word : words1) {
                count1.put(word, count1.getOrDefault(word, 0) + 1);
            }
            for (String word : words2) {
                count2.put(word, count2.getOrDefault(word, 0) + 1);
            }

            int count = 0;
            for (String word : words1) {
                if (count1.getOrDefault(word, 0) == 1 && count2.getOrDefault(word, 0) == 1) count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2085().new Solution();
        Object ans = s.countWords(new String[]{"a", "ab"}, new String[]{"a", "a", "a", "ab"});
        System.out.println(ans);
    }
}