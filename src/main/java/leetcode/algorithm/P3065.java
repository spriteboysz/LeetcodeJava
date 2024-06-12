package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2024-06-12 22:27
 * FileName: src/main/java/leetcode/algorithm
 * Description: 3065. 超过阈值的最少操作数 I
 */

public class P3065 {
    // code beginning
    class Solution {
        public int minOperations(int[] nums, int k) {
            Arrays.sort(nums);
            int cnt = 0;
            for (int num : nums) {
                if (num < k) {
                    cnt += 1;
                } else {
                    break;
                }
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new P3065().new Solution();
        var ans = s.minOperations(new int[]{2, 11, 10, 1, 3}, 10);
        System.out.println(ans);
    }
}
