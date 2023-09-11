package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-08-29 16:19
 * FileName: src/leetcode.algorithm
 * Description:2760. 最长奇偶子数组
 */

public class P2760 {
    // code beginning
    class Solution {
        public int longestAlternatingSubarray(int[] nums, int threshold) {
            int maximum = 0, cur = 0;
            for (int num : nums) {
                if (num > threshold) {
                    cur = 0;
                } else if (cur % 2 == num % 2) {
                    maximum = Math.max(maximum, ++cur);
                } else {
                    cur = (num + 1) % 2;
                }
            }
            return maximum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2760().new Solution();
        Object ans = s.longestAlternatingSubarray(new int[]{2, 3, 4, 5}, 4);
        System.out.println(ans);
    }
}
