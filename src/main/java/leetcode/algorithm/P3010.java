package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2024-01-28 14:38
 * FileName: src/main/java/leetcode/algorithm
 * Description: 3010. 将数组分成最小总代价的子数组 I
 */

public class P3010 {
    // code beginning
    class Solution {
        public int minimumCost(int[] nums) {
            int[] nums2 = Arrays.copyOfRange(nums, 1, nums.length);
            Arrays.sort(nums2);
            return nums[0] + nums2[0] + nums2[1];
        }
    }

    public static void main(String[] args) {
        Solution s = new P3010().new Solution();
        var ans = s.minimumCost(new int[]{10, 3, 1, 1});
        System.out.println(ans);
    }
}
