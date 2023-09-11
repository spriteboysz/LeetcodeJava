package leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-08-07 14:44
 * Description: 697. 数组的度
 */

public class P0697 {
    // code beginning
    class Solution {
        public int findShortestSubArray(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0697().new Solution();
        Object ans = s.findShortestSubArray(new int[]{1, 2, 2, 3, 1, 4, 2});
        System.out.println(ans);
    }
}