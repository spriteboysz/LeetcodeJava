package leetcode.sword;

/**
 * Author: Deean
 * Date: 2022-08-06 19:30
 * Description: 剑指 Offer 42. 连续子数组的最大和
 */

public class O0042 {
    // code beginning
    class Solution {
        public int maxSubArray(int[] nums) {
            int pre = 0, max = nums[0];
            for (int num : nums) {
                pre = Math.max(num, pre + num);
                max = Math.max(max, pre);
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0042().new Solution();
        Object ans = s.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println(ans);
    }
}