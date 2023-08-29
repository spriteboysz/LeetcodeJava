package algorithm;

import java.util.*;

/**
 * Author: Deean
 * Date: 2022-07-08 22:38
 * LastEditTime: 2022-07-08 22:38
 * Description: 884. 两句话中的不常见单词
 */

public class P0884 {
    // code beginning
    class Solution {
        public String[] uncommonFromSentences(String s1, String s2) {
            HashMap<String, Integer> count1 = new HashMap<>(), count2 = new HashMap<>();
            String[] words1 = s1.split(" "), words2 = s2.split(" ");
            for (String word : words1) {
                count1.put(word, count1.getOrDefault(word, 0) + 1);
            }
            for (String word : words2) {
                count2.put(word, count2.getOrDefault(word, 0) + 1);
            }

            List<String> uncommon = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : count1.entrySet()) {
                if (entry.getValue() == 1 && !count2.containsKey(entry.getKey())) {
                    uncommon.add(entry.getKey());
                }
            }
            for (Map.Entry<String, Integer> entry : count2.entrySet()) {
                if (entry.getValue() == 1 && !count1.containsKey(entry.getKey())) {
                    uncommon.add(entry.getKey());
                }
            }
            return uncommon.toArray(new String[0]);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0884().new Solution();
        String[] ans = s.uncommonFromSentences("this apple is sweet", "this apple is sour");
        System.out.println(Arrays.toString(ans));
    }
}