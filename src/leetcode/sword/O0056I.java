package leetcode.sword;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-07-18 00:00
 * LastEditTime: 2022-07-18 00:00
 * Description: 剑指 Offer 56 - I. 数组中数字出现的次数
 */

public class O0056I {
    // code beginning
    class Solution {
        public int[] singleNumbers(int[] nums) {
            HashMap<Integer, Integer> count = new HashMap<>();
            for (int num : nums) {
                count.put(num, count.getOrDefault(num, 0) + 1);
            }

            int[] single = new int[2];
            int index = 0;
            for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
                if (entry.getValue() == 1) single[index++] = entry.getKey();
                if (index > 1) break;
            }
            return single;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0056I().new Solution();
        int[] ans = s.singleNumbers(new int[]{1, 2, 10, 4, 1, 4, 3, 3});
        System.out.println(Arrays.toString(ans));
    }
}