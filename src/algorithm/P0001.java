/**
 * Author: Deean
 * Date: 2022-06-21 23:37
 * LastEditTime: 2022-06-21 23:37
 * Description: 1. 两数之和
 */

package algorithm;

import java.util.Arrays;

public class P0001 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int n = nums.length;
            for (int i = 0; i < n; ++i) {
                for (int j = i + 1; j < n; ++j) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[0];
        }
    }


    public static void main(String[] args) {
        Solution solution = new P0001().new Solution();
        int[] ans = solution.twoSum(new int[]{1, 2, 3, 4, 5}, 4);
        System.out.println(Arrays.toString(ans));
    }
}
