package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-06 19:34
 * Description: 53. 最大子数组和
 */

public class P0053 {
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
        Solution s = new P0053().new Solution();
        Object ans = s.maxSubArray(new int[]{5, 4, -1, 7, 8});
        System.out.println(ans);
    }
}