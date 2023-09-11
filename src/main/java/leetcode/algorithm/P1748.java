package leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-07-03 16:40
 * LastEditTime: 2022-07-03 16:40
 * Description: 1748. 唯一元素的和
 */

public class P1748 {
    // code beginning
    class Solution {
        public int sumOfUnique(int[] nums) {
            HashMap<Integer, Integer> count = new HashMap<>();
            for (int num : nums) {
                count.put(num, count.getOrDefault(num, 0) + 1);
            }

            int sum = 0;
            for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
                int num = entry.getKey(), c = entry.getValue();
                if (c == 1) sum += num;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1748().new Solution();
        Object ans = s.sumOfUnique(new int[]{1, 2, 3, 4, 5, 4});
        System.out.println(ans);
    }
}