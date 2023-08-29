package algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-30 21:25
 * LastEditTime: 2022-07-30 21:25
 * Description: 976. 三角形的最大周长
 */

public class P0976 {
    // code beginning
    class Solution {
        public int largestPerimeter(int[] nums) {
            Arrays.sort(nums);
            for (int i = nums.length - 1; i >= 2; i--) {
                if (nums[i] < nums[i - 1] + nums[i - 2]) {
                    return nums[i - 2] + nums[i - 1] + nums[i];
                }
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0976().new Solution();
        Object ans = s.largestPerimeter(new int[]{2, 2, 1});
        System.out.println(ans);
    }
}