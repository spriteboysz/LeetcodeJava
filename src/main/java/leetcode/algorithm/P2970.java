package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2024-01-01 11:39
 * FileName: src/main/java/leetcode/algorithm
 * Description: 2970. 统计移除递增子数组的数目 I
 */

public class P2970 {
    // code beginning
    class Solution {
        public int incremovableSubarrayCount(int[] nums) {
            int cnt = 0;
            for (int i = 0, n = nums.length; i < n; i++) {
                for (int j = i; j < n; j++) {
                    if (check(nums, i - 1, j + 1)) {
                        cnt++;
                    }
                }
            }
            return cnt;
        }

        private boolean check(int[] nums, int left, int right) {
            if (left >= 0 && right <= nums.length - 1 && nums[left] >= nums[right]) {
                return false;
            }
            for (int i = left; i - 1 >= 0; i--) {
                if (nums[i] <= nums[i - 1]) {
                    return false;
                }
            }
            for (int i = nums.length - 1; i - 1 >= right; i--) {
                if (nums[i] <= nums[i - 1]) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2970().new Solution();
        var ans = s.incremovableSubarrayCount(new int[]{8, 7, 6, 6});
        System.out.println(ans);
    }
}
