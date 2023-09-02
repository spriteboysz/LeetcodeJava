package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-30 21:35
 * LastEditTime: 2022-07-30 21:35
 * Description: 219. 存在重复元素 II
 */

public class P0219 {
    // code beginning
    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j <= i + k && j < nums.length; j++) {
                    if (nums[i] == nums[j]) return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0219().new Solution();
        Object ans = s.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1);
        System.out.println(ans);
        ans = s.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2);
        System.out.println(ans);
    }
}