package LCP;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-15 23:05
 * FileName: src/leetcode/editor/cn/LCP
 * Description: LCP 28. 采购方案
 */

public class LCP0028 {
    // code beginning
    class Solution {
        public int purchasePlans(int[] nums, int target) {
            int MOD = 1_000_000_007;
            int count = 0;
            Arrays.sort(nums);
            int left = 0, right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] > target) {
                    right--;
                } else {
                    count += right - left;
                    left++;
                }
                count %= MOD;
            }
            return count % MOD;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCP0028().new Solution();
        Object ans = s.purchasePlans(new int[]{2, 2, 1, 9}, 10);
        System.out.println(ans);
        ans = s.purchasePlans(new int[]{2, 5, 3, 5}, 6);
        System.out.println(ans);
    }
}