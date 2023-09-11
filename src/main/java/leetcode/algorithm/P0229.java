package leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-07-24 16:36
 * LastEditTime: 2022-07-24 16:36
 * Description: 229. 多数元素 II
 */

public class P0229 {
    // code beginning
    class Solution {
        public List<Integer> majorityElement(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            List<Integer> majority = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > nums.length / 3) majority.add(entry.getKey());
            }
            return majority;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0229().new Solution();
        Object ans = s.majorityElement(new int[]{1, 2});
        System.out.println(ans);
    }
}