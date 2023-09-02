package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-01 21:02
 * FileName: src/leetcode.common
 * Description:2740. 找出分区值
 */

public class P2740 {
    // code beginning
    class Solution {
        public int findValueOfPartition(int[] nums) {
            Arrays.sort(nums);
            int minimum = nums[1] - nums[0];
            for (int i = 2; i < nums.length; i++) {
                minimum = Math.min(minimum, nums[i] - nums[i - 1]);
            }
            return minimum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2740().new Solution();
        Object ans = s.findValueOfPartition(new int[]{100, 1, 10});
        System.out.println(ans);
    }
}
