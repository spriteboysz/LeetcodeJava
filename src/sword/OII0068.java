package sword;

/**
 * Author: Deean
 * Date: 2022-07-31 23:30
 * LastEditTime: 2022-07-31 23:30
 * Description: 剑指 Offer II 068. 查找插入位置
 */

public class OII0068 {
    // code beginning
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int left = 0, right = nums.length - 1, index = nums.length;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] >= target) {
                    index = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return index;
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0068().new Solution();
        Object ans = s.searchInsert(new int[]{1, 3, 5, 6}, 2);
        System.out.println(ans);
    }
}