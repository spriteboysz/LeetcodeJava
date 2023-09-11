package leetcode.algorithm;

/**
 * Author: @Deean
 * Date: 2022-06-22 22:44
 * LastEditTime: 2022-06-22 22:44
 * Description: 只出现一次的数字
 */

public class P0136 {
    // code beginning
    class Solution {
        public int singleNumber(int[] nums) {
            for (int i = 1; i < nums.length; i++) {
                nums[0] ^= nums[i];
            }
            return nums[0];
        }
    }

    public static void main(String[] args) {
        Solution s = new P0136().new Solution();
        int ans = s.singleNumber(new int[]{4, 1, 2, 1, 2, 3, 4});
        System.out.println(ans);
    }
}