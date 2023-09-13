package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-13 21:33
 * FileName: src/main/java/leetcode/algorithm
 * Description:1509. 三次操作后最大值与最小值的最小差
 */

public class P1509 {
    // code beginning
    class Solution {
        public int minDifference(int[] nums) {
            if (nums.length <= 4) return 0;
            Arrays.sort(nums);
            int minimum = Integer.MAX_VALUE;
            for (int i = 0, n = nums.length; i < 4; i++) {
                minimum = Math.min(minimum, nums[n - 4 + i] - nums[i]);
            }
            return minimum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1509().new Solution();
        var ans = s.minDifference(new int[]{1, 5, 0, 10, 14});
        System.out.println(ans);
    }
}
