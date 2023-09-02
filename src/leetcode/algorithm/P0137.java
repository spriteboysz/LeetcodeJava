package leetcode.algorithm;

import java.util.HashMap;

/**
 * Author: Deean
 * Date: 2022-07-17 23:18
 * LastEditTime: 2022-07-17 23:18
 * Description: 137. 只出现一次的数字 II
 */

public class P0137 {
    // code beginning
    class Solution {
        public int singleNumber(int[] nums) {
            HashMap<Integer, Integer> count = new HashMap<>();
            for (int num : nums) {
                count.put(num, count.getOrDefault(num, 0) + 1);
            }
            for (int key : count.keySet()) {
                if (count.get(key) == 1) return key;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0137().new Solution();
        Object ans = s.singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99});
        System.out.println(ans);
    }
}