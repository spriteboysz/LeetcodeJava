package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-12 22:51
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 2016. 增量元素之间的最大差值
 */

public class P2016 {
    // code beginning
    class Solution {
        public int maximumDifference(int[] nums) {
            int max = -1;
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] > nums[i]) {
                        max = Math.max(max, nums[j] - nums[i]);
                    }
                }
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2016().new Solution();
        Object ans = s.maximumDifference(new int[]{1, 5, 2, 10});
        System.out.println(ans);
        ans = s.maximumDifference(new int[]{9, 4, 3, 2});
        System.out.println(ans);
    }
}