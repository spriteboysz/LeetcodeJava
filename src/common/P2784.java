package common;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-08-30 21:13
 * FileName: src/common
 * Description:2784. 检查数组是否是好的
 */

public class P2784 {
    // code beginning
    class Solution {
        public boolean isGood(int[] nums) {
            int n = nums.length;
            Arrays.sort(nums);
            for (int i = 0; i < n - 1; i++) {
                if (nums[i] != i + 1) {
                    return false;
                }
            }
            return nums[n - 1] == n - 1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2784().new Solution();
        Object ans = s.isGood(new int[]{1, 3, 3, 2});
        System.out.println(ans);
    }
}
