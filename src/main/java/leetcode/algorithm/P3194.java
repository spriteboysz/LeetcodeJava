package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2024-06-28 22:23
 * FileName: src/main/java/leetcode/algorithm
 * Description: 3194. 最小元素和最大元素的最小平均值
 */

public class P3194 {
    // code beginning
    class Solution {
        public double minimumAverage(int[] nums) {
            Arrays.sort(nums);
            double average = (nums[0] + nums[nums.length - 1]) / 2.0;
            for (int i = 0; i < nums.length / 2; i++) {
                average = Math.min(average, (nums[i] + nums[nums.length - 1 - i]) / 2.0);
            }
            return average;
        }
    }

    public static void main(String[] args) {
        Solution s = new P3194().new Solution();
        var ans = s.minimumAverage(new int[]{7, 8, 3, 4, 15, 13, 4, 1});
        System.out.println(ans);
    }
}
