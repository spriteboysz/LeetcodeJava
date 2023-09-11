package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-10 11:49
 * FileName: src/leetcode/algorithm
 * Description:2090. 半径为 k 的子数组平均值
 */

public class P2090 {
    // code beginning
    class Solution {
        public int[] getAverages(int[] nums, int k) {
            int n = nums.length;
            int[] averages = new int[n];
            Arrays.fill(averages, -1);
            long[] pref = new long[n + 1];
            for (int i = 0; i < n; i++) {
                pref[i + 1] = pref[i] + nums[i];
            }
            for (int i = 0; i < n; i++) {
                if (i - k >= 0 && i + k < n) {
                    averages[i] = (int) ((pref[i + k + 1] - pref[i - k]) / (2 * k + 1));
                }
            }
            return averages;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2090().new Solution();
        var ans = s.getAverages(new int[]{7, 4, 3, 9, 1, 8, 5, 2, 6}, 3);
        System.out.println(Arrays.toString(ans));
    }
}
