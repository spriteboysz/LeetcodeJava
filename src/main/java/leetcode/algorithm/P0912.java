package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-25 00:10
 * LastEditTime: 2022-07-25 00:10
 * Description: 912. 排序数组
 */

public class P0912 {
    // code beginning
    class Solution {
        public int[] sortArray(int[] nums) {
            Arrays.sort(nums);
            return nums;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0912().new Solution();
        int[] ans = s.sortArray(new int[]{5, 1, 1, 2, 0, 0});
        System.out.println(Arrays.toString(ans));
    }
}