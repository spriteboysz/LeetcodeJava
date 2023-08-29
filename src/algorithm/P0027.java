package algorithm;

/**
 * Author: @Deean
 * Date: 2022-06-22 00:16
 * LastEditTime: 2022-06-22 00:16
 * Description: 移除元素
 */

public class P0027 {
    // code beginning
    class Solution {
        public int removeElement(int[] nums, int val) {
            int n = nums.length;
            int left = 0;
            for (int right = 0; right < n; right++) {
                if (nums[right] != val) {
                    nums[left] = nums[right];
                    left++;
                }
            }
            return left;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0027().new Solution();
        int ans = s.removeElement(new int[]{3, 2, 2, 3}, 3);
        System.out.println(ans);
    }
}