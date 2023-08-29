package sword;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-07-17 16:02
 * LastEditTime: 2022-07-17 16:02
 * Description: 剑指 Offer 56 - II. 数组中数字出现的次数 II
 */

public class O0056II {
    // code beginning
    class Solution {
        public int singleNumber(int[] nums) {
            HashMap<Integer, Integer> count = new HashMap<>();
            for (int num : nums) {
                count.put(num, count.getOrDefault(num, 0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
                if (entry.getValue() == 1) return entry.getKey();
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0056II().new Solution();
        Object ans = s.singleNumber(new int[]{9, 1, 7, 9, 7, 9, 7});
        System.out.println(ans);
    }
}