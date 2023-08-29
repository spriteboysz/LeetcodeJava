package algorithm;

import java.util.HashMap;

/**
 * Author: Deean
 * Date: 2022-06-27 23:20
 * LastEditTime: 2022-06-27 23:20
 * Description: .
 */

public class P0169 {
    // code beginning
    class Solution {
        public int majorityElement(int[] nums) {
            HashMap<Integer, Integer> counts = new HashMap<>();
            for (int num : nums) {
                counts.put(num, counts.getOrDefault(num, 0) + 1);
                if (counts.get(num) > nums.length / 2) {
                    return num;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0169().new Solution();
        Object ans = s.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});
        System.out.println(ans);
    }
}