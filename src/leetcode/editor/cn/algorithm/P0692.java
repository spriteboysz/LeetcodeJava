package leetcode.editor.cn.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-07-24 23:16
 * LastEditTime: 2022-07-24 23:16
 * Description: 692. 前K个高频单词
 */

public class P0692 {
    // code beginning
    class Solution {
        public List<String> topKFrequent(String[] words, int k) {
            Map<String, Integer> map = new HashMap<>();
            for (String word : words) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
            List<String> wordSet = new ArrayList<>(map.keySet());
            wordSet.sort((o1, o2) -> {
                if (!map.get(o1).equals(map.get(o2))) {
                    return map.get(o2) - map.get(o1);
                } else {
                    return o1.compareTo(o2);
                }
            });
            return wordSet.subList(0, k);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0692().new Solution();
        Object ans = s.topKFrequent(new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4);
        System.out.println(ans);
    }
}