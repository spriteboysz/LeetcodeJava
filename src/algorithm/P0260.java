package algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-07-17 22:01
 * LastEditTime: 2022-07-17 22:01
 * Description: 260. 只出现一次的数字 III
 */

public class P0260 {
    // code beginning
    class Solution {
        public int[] singleNumber(int[] nums) {
            HashMap<Integer, Integer> count = new HashMap<>();
            for (int num : nums) {
                count.put(num, count.getOrDefault(num, 0) + 1);
            }

            int[] single = new int[2];
            int i = 0;
            for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
                if (entry.getValue() == 1) single[i++] = entry.getKey();
                if (i > 2) break;
            }
            return single;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0260().new Solution();
        int[] ans = s.singleNumber(new int[]{1, 2, 1, 3, 2, 5});
        System.out.println(Arrays.toString(ans));
    }
}