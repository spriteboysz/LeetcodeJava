package leetcode.algorithm;

import java.util.HashMap;

/**
 * Author: Deean
 * Date: 2024-01-28 14:50
 * FileName: src/main/java/leetcode/algorithm
 * Description: 3005. 最大频率元素计数
 */

public class P3005 {
    // code beginning
    class Solution {
        public int maxFrequencyElements(int[] nums) {
            HashMap<Integer, Integer> hash = new HashMap<>();
            for (int num : nums) {
                hash.put(num, hash.getOrDefault(num, 0) + 1);
            }
            int maximum = 0;
            for (Integer value : hash.values()) {
                maximum = Math.max(maximum, value);
            }
            int sum = 0;
            for (Integer value : hash.values()) {
                if (value == maximum) {
                    sum += value;
                }
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P3005().new Solution();
        var ans = s.maxFrequencyElements(new int[]{1, 2, 2, 3, 1, 4});
        System.out.println(ans);
    }
}
