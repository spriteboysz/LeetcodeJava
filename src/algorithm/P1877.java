package algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-17 14:10
 * LastEditTime: 2022-07-17 14:10
 * Description: 1877. 数组中最大数对和的最小值
 */

public class P1877 {
    // code beginning
    class Solution {
        public int minPairSum(int[] nums) {
            Arrays.sort(nums);
            int maxSum = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length / 2; i++) {
                maxSum = Math.max(maxSum, nums[i] + nums[nums.length - 1 - i]);
            }
            return maxSum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1877().new Solution();
        Object ans = s.minPairSum(new int[]{3, 5, 4, 2, 4, 6});
        System.out.println(ans);
    }
}