package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-29 23:07
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 162. 寻找峰值
 */

public class P0162 {
    // code beginning
    class Solution {
        public int findPeakElement(int[] nums) {
            if (nums.length == 1) return 0;
            int left = 0, right = nums.length - 1;
            while (left < right) {
                int mid = (left + right) / 2;
                if (nums[mid] > nums[mid + 1]) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            return right;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0162().new Solution();
        Object ans = s.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4});
        System.out.println(ans);
    }
}