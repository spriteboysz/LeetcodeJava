package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-28 00:12
 * LastEditTime: 2022-07-28 00:12
 * Description: 154. 寻找旋转排序数组中的最小值 II
 */

public class P0154 {
    // code beginning
    class Solution {
        public int findMin(int[] nums) {
            int left = 0, right = nums.length - 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] < nums[right]) {
                    right = mid;
                } else if (nums[mid] > nums[right]) {
                    left = mid + 1;
                } else {
                    right -= 1;
                }
            }
            return nums[left];
        }
    }

    public static void main(String[] args) {
        Solution s = new P0154().new Solution();
        Object ans = s.findMin(new int[]{2, 2, 2, 0, 1});
        System.out.println(ans);
    }
}