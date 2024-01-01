package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2024-01-01 11:15
 * FileName: src/main/java/leetcode/algorithm
 * Description: 2903. 找出满足差值条件的下标 I
 */

public class P2903 {
    // code beginning
    class Solution {
        public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
            for (int i = 0, n = nums.length; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (Math.abs(i - j) >= indexDifference && Math.abs(nums[i] - nums[j]) >= valueDifference) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[]{-1, -1};
        }
    }

    public static void main(String[] args) {
        Solution s = new P2903().new Solution();
        var ans = s.findIndices(new int[]{5, 1, 4, 1}, 2, 4);
        System.out.println(Arrays.toString(ans));
    }
}
