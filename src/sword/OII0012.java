package sword;

/**
 * Author: Deean
 * Date: 2022-07-16 23:33
 * LastEditTime: 2022-07-16 23:33
 * Description: 剑指 Offer II 012. 左右两边子数组的和相等
 */

public class OII0012 {
    // code beginning
    class Solution {
        public int pivotIndex(int[] nums) {
            int left = 0, right = 0;
            for (int num : nums) {
                right += num;
            }
            for (int i = 0; i < nums.length; i++) {
                left += nums[i];
                right -= nums[i];
                if (left - nums[i] == right) {
                    return i;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0012().new Solution();
        Object ans = s.pivotIndex(new int[]{2, 1, -1});
        System.out.println(ans);
    }
}