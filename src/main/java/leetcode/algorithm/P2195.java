package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-09 21:48
 * FileName: src/leetcode/algorithm
 * Description:2195. 向数组中追加 K 个整数
 */

public class P2195 {
    // code beginning
    class Solution {
        public long minimalKSum(int[] nums, int k) {
            Arrays.sort(nums);
            long sum = (1L + k) * k / 2, next = k;

            if (nums[0] > k) return sum;
            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i - 1] == nums[i]) continue;
                if (nums[i] <= next) {
                    next++; // 更新萝卜
                    sum = sum - nums[i] + next;
                }
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2195().new Solution();
        var ans = s.minimalKSum(new int[]{1, 4, 25, 10, 25}, 2);
        System.out.println(ans);
    }
}
