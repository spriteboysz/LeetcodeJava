package algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-02 21:48
 * LastEditTime: 2022-07-02 21:48
 * Description: 1365. 有多少小于当前数字的数字
 */

public class P1365 {
    // code beginning
    class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int[] count = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                for (int num : nums) {
                    if (nums[i] > num) count[i]++;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1365().new Solution();
        int[] ans = s.smallerNumbersThanCurrent(new int[]{6, 5, 4, 8});
        System.out.println(Arrays.toString(ans));
    }
}