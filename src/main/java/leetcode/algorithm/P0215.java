package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-20 23:53
 * LastEditTime: 2022-07-20 23:53
 * Description: 215. 数组中的第K个最大元素
 */

public class P0215 {
    // code beginning
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            Arrays.sort(nums);
            return nums[nums.length - k];
        }
    }

    public static void main(String[] args) {
        Solution s = new P0215().new Solution();
        Object ans = s.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2);
        System.out.println(ans);
    }
}