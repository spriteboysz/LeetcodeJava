package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-14 23:30
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1800. 最大升序子数组和
 */

public class P1800 {
    // code beginning
    class Solution {
        public int maxAscendingSum(int[] nums) {
            int max = nums[0], cur = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > nums[i - 1]) {
                    cur += nums[i];
                } else {
                    cur = nums[i];
                }
                max = Math.max(max, cur);
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1800().new Solution();
        Object ans = s.maxAscendingSum(new int[]{12, 17, 15, 13, 10, 11, 12});
        System.out.println(ans);
    }
}