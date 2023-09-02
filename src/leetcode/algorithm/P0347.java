package leetcode.algorithm;

import java.util.*;

/**
 * Author: Deean
 * Date: 2022-07-24 18:21
 * LastEditTime: 2022-07-24 18:21
 * Description: 347. 前 K 个高频元素
 */

public class P0347 {
    // code beginning
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            List<Integer> key = new ArrayList<>(map.keySet());
            key.sort((o1, o2) -> map.get(o2) - map.get(o1));
            int[] top = new int[k];
            for (int i = 0; i < k; i++) {
                top[i] = key.get(i);
            }
            return top;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0347().new Solution();
        int[] ans = s.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        System.out.println(Arrays.toString(ans));
    }
}