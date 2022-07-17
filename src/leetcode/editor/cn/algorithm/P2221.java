package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-17 16:52
 * LastEditTime: 2022-07-17 16:52
 * Description: 2221. 数组的三角和
 */

public class P2221 {
    // code beginning
    class Solution {
        public int triangularSum(int[] nums) {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = 0; j < nums.length - 1 - i; j++) {
                    nums[j] = (nums[j] + nums[j + 1]) % 10;
                }
                // System.out.println(Arrays.toString(nums));
            }
            return nums[0];
        }
    }

    public static void main(String[] args) {
        Solution s = new P2221().new Solution();
        Object ans = s.triangularSum(new int[]{1, 2, 3, 4, 5});
        System.out.println(ans);
    }
}