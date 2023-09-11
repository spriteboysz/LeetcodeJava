package leetcode.algorithm;

import java.util.*;

/**
 * Author: Deean
 * Date: 2022-08-06 22:59
 * Description: 350. 两个数组的交集 II
 */

public class P0350 {
    // code beginning
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            Map<Integer, Integer> map1 = new HashMap<>(), map2 = new HashMap<>();
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums1) map1.put(num, map1.getOrDefault(num, 0) + 1);
            for (int num : nums2) map2.put(num, map2.getOrDefault(num, 0) + 1);
            for (int num : map1.keySet()) {
                if (map2.containsKey(num)) map.put(num, Math.min(map1.get(num), map2.get(num)));
            }
            List<Integer> nums = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                for (int i = 0; i < entry.getValue(); i++) {
                    nums.add(entry.getKey());
                }
            }
            int[] intersect = new int[nums.size()];
            for (int i = 0; i < nums.size(); i++) {
                intersect[i] = nums.get(i);
            }
            return intersect;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0350().new Solution();
        int[] ans = s.intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
        System.out.println(Arrays.toString(ans));
    }
}