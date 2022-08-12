package leetcode.editor.cn.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-08-12 21:25
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2347. 最好的扑克手牌
 */

public class P2347 {
    // code beginning
    class Solution {
        public String bestHand(int[] ranks, char[] suits) {
            Set<Character> set = new HashSet<>();
            for (char suit : suits) {
                set.add(suit);
            }
            if (set.size() == 1) return "Flush";

            Map<Integer, Integer> map = new HashMap<>();
            for (int rank : ranks) {
                map.put(rank, map.getOrDefault(rank, 0) + 1);
            }
            int max = 0;
            for (int v : map.values()) max = Math.max(max, v);
            return switch (max) {
                case 4, 3 -> "Three of a Kind";
                case 2 -> "Pair";
                default -> "High Card";
            };
        }
    }

    public static void main(String[] args) {
        Solution s = new P2347().new Solution();
        Object ans = s.bestHand(new int[]{4, 4, 2, 4, 4}, new char[]{'d', 'a', 'a', 'b', 'c'});
        System.out.println(ans);
    }
}