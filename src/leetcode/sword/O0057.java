package leetcode.sword;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-07-10 17:36
 * LastEditTime: 2022-07-10 17:36
 * Description: 剑指 Offer 57. 和为s的两个数字
 */

public class O0057 {
    // code beginning
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (set.contains(target - num)) {
                    return new int[]{num, target - num};
                } else {
                    set.add(num);
                }
            }
            return new int[]{-1, -1};
        }
    }

    public static void main(String[] args) {
        Solution s = new O0057().new Solution();
        int[] ans = s.twoSum(new int[]{10, 26, 30, 31, 47, 60}, 40);
        System.out.println(Arrays.toString(ans));
        ans = s.twoSum(new int[]{20, 20}, 40);
        System.out.println(Arrays.toString(ans));
    }
}