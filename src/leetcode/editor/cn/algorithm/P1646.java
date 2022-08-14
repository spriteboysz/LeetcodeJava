package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-13 21:56
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1646. 获取生成数组中的最大值
 */

public class P1646 {
    // code beginning
    class Solution {
        public int getMaximumGenerated(int n) {
            if (n == 0 || n == 1) return n;
            int[] nums = new int[n + 1];
            nums[1] = 1;
            int max = 0;
            for (int i = 2; i < nums.length; i++) {
                if (i % 2 == 0) {
                    nums[i] = nums[i / 2];
                } else {
                    nums[i] = nums[i / 2] + nums[i / 2 + 1];
                }
                max = Math.max(max, nums[i]);
            }
            // System.out.println(Arrays.toString(nums));
            return max;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1646().new Solution();
        Object ans = s.getMaximumGenerated(7);
        System.out.println(ans);
    }
}