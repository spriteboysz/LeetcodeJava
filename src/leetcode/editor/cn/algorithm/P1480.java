package leetcode.editor.cn.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-06-29 23:44
 * LastEditTime: 2022-06-29 23:44
 * Description: 1480. 一维数组的动态和
 */

public class P1480 {
    // code beginning
    class Solution {
        public int[] runningSum(int[] nums) {
            int[] running = new int[nums.length];
            int sums = 0;
            for (int i = 0; i < nums.length; i++) {
                sums += nums[i];
                running[i] = sums;
            }
            return running;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1480().new Solution();
        int[] ans = s.runningSum(new int[]{1, 1, 1, 1, 1});
        System.out.println(Arrays.toString(ans));
    }
}