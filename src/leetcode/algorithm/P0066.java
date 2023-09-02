package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-31 17:21
 * LastEditTime: 2022-07-31 17:21
 * Description: 66. 加一
 */

public class P0066 {
    // code beginning
    class Solution {
        public int[] plusOne(int[] digits) {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] != 9) {
                    digits[i]++;
                    for (int j = i + 1; j < digits.length; j++) {
                        digits[j] = 0;
                    }
                    return digits;
                }
            }

            // digits 中所有的元素均为 9
            int[] nums = new int[digits.length + 1];
            nums[0] = 1;
            return nums;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0066().new Solution();
        int[] ans = s.plusOne(new int[]{4, 3, 2, 1});
        System.out.println(Arrays.toString(ans));
    }
}