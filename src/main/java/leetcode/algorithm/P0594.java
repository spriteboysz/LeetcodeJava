package leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-08-14 22:31
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 594. 最长和谐子序列
 */

public class P0594 {
    // code beginning
    class Solution {
        public int findLHS(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            int max = 0;
            for (int num : map.keySet()) {
                if (map.containsKey(num + 1)) {
                    max = Math.max(max, map.get(num) + map.get(num + 1));
                }
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0594().new Solution();
        Object ans = s.findLHS(new int[]{1, 3, 2, 2, 5, 2, 3, 7});
        System.out.println(ans);
        ans = s.findLHS(new int[]{1, 2, 3, 4});
        System.out.println(ans);
        ans = s.findLHS(new int[]{1, 1, 1, 1});
        System.out.println(ans);
    }
}