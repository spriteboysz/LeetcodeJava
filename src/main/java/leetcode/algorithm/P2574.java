package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-08 20:45
 * FileName: src/leetcode/algorithm
 * Description:2574. 左右元素和的差值
 */

public class P2574 {
    // code beginning
    class Solution {
        public int[] leftRightDifference(int[] nums) {
            int sum = 0;
            for (int num : nums) {
                sum += num;
            }
            int[] diff = new int[nums.length];
            for (int i = 0, n = nums.length, temp = 0; i < n; i++) {
                diff[i] = Math.abs(sum - temp - nums[i] - temp);
                temp += nums[i];
            }
            return diff;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2574().new Solution();
        var ans = s.leftRightDifference(new int[]{10, 4, 8, 3});
        System.out.println(Arrays.toString(ans));
    }
}
