package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-06-30 22:57
 * LastEditTime: 2022-06-30 22:57
 * Description: 1920. 基于排列构建数组
 */

public class P1920 {
    // code beginning
    class Solution {
        public int[] buildArray(int[] nums) {
            int[] array = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                array[i] = nums[nums[i]];
            }
            return array;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1920().new Solution();
        int[] ans = s.buildArray(new int[]{5, 0, 1, 2, 3, 4});
        System.out.println(Arrays.toString(ans));
    }
}