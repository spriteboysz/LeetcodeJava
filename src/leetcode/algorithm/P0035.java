package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-06-26 17:03
 * LastEditTime: 2022-06-26 17:03
 * Description: 35. 搜索插入位置
 */

public class P0035 {
    // code beginning
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int left = 0, right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return left;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0035().new Solution();
        Object ans = s.searchInsert(new int[]{1, 3, 5, 7}, 8);
        System.out.println(ans);
    }
}