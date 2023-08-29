package algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-13 23:48
 * LastEditTime: 2022-07-13 23:48
 * Description: 1984. 学生分数的最小差值
 */

public class P1984 {
    // code beginning
    class Solution {
        public int minimumDifference(int[] nums, int k) {
            Arrays.sort(nums);
            int min = Integer.MAX_VALUE;
            for (int i = 0; i <= nums.length - k; i++) {
                min = Math.min(min, nums[i + k - 1] - nums[i]);
            }
            return min;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1984().new Solution();
        Object ans = s.minimumDifference(new int[]{9, 4, 1, 7}, 2);
        System.out.println(ans);
    }
}