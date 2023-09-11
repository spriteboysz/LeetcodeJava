package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-17 21:32
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 628. 三个数的最大乘积
 */

public class P0628 {
    // code beginning
    class Solution {
        public int maximumProduct(int[] nums) {
            Arrays.sort(nums);
            int n = nums.length;
            return Math.max(nums[n - 3] * nums[n - 2] * nums[n - 1], nums[0] * nums[1] * nums[n - 1]);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0628().new Solution();
        Object ans = s.maximumProduct(new int[]{-1, -2, -3});
        System.out.println(ans);
    }
}