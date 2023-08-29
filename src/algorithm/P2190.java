package algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-07-25 22:45
 * LastEditTime: 2022-07-25 22:45
 * Description: 2190. 数组中紧跟 key 之后出现最频繁的数字
 */

public class P2190 {
    // code beginning
    class Solution {
        public int mostFrequent(int[] nums, int key) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == key) {
                    map.put(nums[i + 1], map.getOrDefault(nums[i + 1], 0) + 1);
                }
            }
            int target = nums[0], max = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    target = entry.getKey();
                }
            }
            return target;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2190().new Solution();
        Object ans = s.mostFrequent(new int[]{2, 2, 2, 2, 3}, 2);
        System.out.println(ans);
    }
}