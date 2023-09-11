package leetcode.algorithm;

import java.util.HashSet;

/**
 * Author: Deean
 * Date: 2023-09-09 20:52
 * FileName: src/leetcode/algorithm
 * Description:2395. 和相等的子数组
 */

public class P2395 {
    // code beginning
    class Solution {
        public boolean findSubarrays(int[] nums) {
            HashSet<Integer> seen = new HashSet<>();
            for (int i = 0, n = nums.length; i < n - 1; i++) {
                int sum = nums[i] + nums[i + 1];
                if (seen.contains(sum)) {
                    return true;
                } else {
                    seen.add(sum);
                }
            }
            return false;
        }

    }

    public static void main(String[] args) {
        Solution s = new P2395().new Solution();
        var ans = s.findSubarrays(new int[]{4, 2, 4});
        System.out.println(ans);
    }
}
