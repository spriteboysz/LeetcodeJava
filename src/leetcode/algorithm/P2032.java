package leetcode.algorithm;

import java.util.*;

/**
 * Author: Deean
 * Date: 2022-07-13 23:07
 * LastEditTime: 2022-07-13 23:07
 * Description: 2032. 至少在两个数组中出现的值
 */

public class P2032 {
    // code beginning
    class Solution {
        public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int[] nums : new int[][]{nums1, nums2, nums3}) {
                Set<Integer> set = new HashSet<>();
                for (int num : nums) {
                    set.add(num);
                }
                for (int num : set) {
                    hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
                }
            }
            List<Integer> list = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                if (entry.getValue() >= 2) list.add(entry.getKey());
            }
            return list;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2032().new Solution();
        Object ans = s.twoOutOfThree(new int[]{3, 1}, new int[]{2, 3}, new int[]{1, 2});
        System.out.println(ans);
    }
}