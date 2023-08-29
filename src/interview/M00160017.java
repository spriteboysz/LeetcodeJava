package interview;

/**
 * Author: Deean
 * Date: 2022-08-12 21:12
 * FileName: src/leetcode/editor/cn/interview
 * Description: 面试题 16.17. 连续数列
 */

public class M00160017 {
    // code beginning
    class Solution {
        public int maxSubArray(int[] nums) {
            int pre = 0, max = nums[0];
            for (int num : nums) {
                pre = Math.max(pre + num, num);
                max = Math.max(max, pre);
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00160017().new Solution();
        Object ans = s.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println(ans);
    }
}