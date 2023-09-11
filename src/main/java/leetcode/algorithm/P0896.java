package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-16 10:19
 * LastEditTime: 2022-07-16 10:19
 * Description: .
 */

public class P0896 {
    // code beginning
    class Solution {
        public boolean isMonotonic(int[] nums) {
            boolean inc = true, dec = true;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i + 1] > nums[i]) dec = false;
                if (nums[i + 1] < nums[i]) inc = false;
            }
            return dec || inc;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0896().new Solution();
        Object ans = s.isMonotonic(new int[]{6, 5, 4, 4});
        System.out.println(ans);
    }
}