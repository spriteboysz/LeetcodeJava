package leetcode.editor.cn.sword;

/**
 * Author: Deean
 * Date: 2022-07-31 23:37
 * LastEditTime: 2022-07-31 23:37
 * Description: 剑指 Offer 53 - II. 0～n-1中缺失的数字
 */

public class O0053II {
    // code beginning
    class Solution {
        public int missingNumber(int[] nums) {
            int left = 0, right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (mid == nums[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return left;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0053II().new Solution();
        Object ans = s.missingNumber(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 9});
        System.out.println(ans);
    }
}