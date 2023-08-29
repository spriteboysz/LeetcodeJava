package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-08-12 21:33
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2239. 找到最接近 0 的数字
 */

public class P2239 {
    // code beginning
    class Solution {
        public int findClosestNumber(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, Math.abs(num));
            }
            int min = Integer.MAX_VALUE;
            for (int v : map.values()) min = Math.min(min, v);
            List<Integer> keys = new ArrayList<>();
            for (int k : map.keySet()) {
                if (map.get(k) == min) keys.add(k);
            }
            return keys.size() == 1 ? keys.get(0) : Math.abs(keys.get(0));
        }
    }

    public static void main(String[] args) {
        Solution s = new P2239().new Solution();
        Object ans = s.findClosestNumber(new int[]{-4, -2, 1, 4, 8});
        System.out.println(ans);
    }
}