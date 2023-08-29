package algorithm;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * Author: Deean
 * Date: 2022-07-23 22:56
 * LastEditTime: 2022-07-23 22:56
 * Description: 506. 相对名次
 */

public class P0506 {
    // code beginning
    class Solution {
        public String[] findRelativeRanks(int[] score) {
            Map<Integer, Integer> map = new TreeMap<>();
            int[] clone = score.clone();
            Arrays.sort(score);
            for (int i = 0; i < score.length; i++) {
                map.put(score[i], score.length - i);
            }
            String[] ranks = new String[score.length];
            for (int i = 0; i < score.length; i++) {
                switch (map.get(clone[i])) {
                    case 1 -> ranks[i] = "Gold Medal";
                    case 2 -> ranks[i] = "Silver Medal";
                    case 3 -> ranks[i] = "Bronze Medal";
                    default -> ranks[i] = String.valueOf(map.get(clone[i]));
                }
            }
            return ranks;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0506().new Solution();
        Object[] ans = s.findRelativeRanks(new int[]{10, 3, 8, 9, 4});
        System.out.println(Arrays.toString(ans));
    }
}