package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-28 00:09
 * LastEditTime: 2022-07-28 00:09
 * Description: 153. 寻找旋转排序数组中的最小值
 */

public class P0153 {
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
                }
            }
            return nums[left];
        }
    }

    public static void main(String[] args) {
        Solution s = new P0153().new Solution();
        Object ans = s.findMin(new int[]{4, 5, 6, 7, 0, 1, 2});
        System.out.println(ans);
    }
}