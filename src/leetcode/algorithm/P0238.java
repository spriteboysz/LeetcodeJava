package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-17 21:50
 * LastEditTime: 2022-07-17 21:50
 * Description: .
 */

public class P0238 {
    // code beginning
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int[] product = new int[nums.length];
            int p = 1, q = 1;
            for (int i = 0; i < nums.length; i++) {
                product[i] = p;
                p *= nums[i];
            }
            for (int i = nums.length - 1; i > 0; i--) {
                q *= nums[i];
                product[i - 1] *= q;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0238().new Solution();
        int[] ans = s.productExceptSelf(new int[]{-1, 1, 0, -3, 3});
        System.out.println(Arrays.toString(ans));
    }
}