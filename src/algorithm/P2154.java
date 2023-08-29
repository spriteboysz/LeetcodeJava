package algorithm;

import java.util.HashSet;

/**
 * Author: Deean
 * Date: 2022-07-04 23:53
 * LastEditTime: 2022-07-04 23:53
 * Description: 2154. 将找到的值乘以 2
 */

public class P2154 {
    // code beginning
    class Solution {
        public int findFinalValue(int[] nums, int original) {
            HashSet<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num);
            }
            while (set.contains(original)) {
                original *= 2;
            }
            return original;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2154().new Solution();
        Object ans = s.findFinalValue(new int[]{5, 3, 6, 1, 12}, 3);
        System.out.println(ans);
    }
}