package leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-19 23:53
 * LastEditTime: 2022-07-19 23:53
 * Description: 78. 子集
 */

public class P0078 {
    // code beginning
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> subsets = new ArrayList<>();
            for (int i = 0; i < Math.pow(2, nums.length); i++) {
                List<Integer> subset = new ArrayList<>();
                for (int j = 0; j < nums.length; j++) {
                    if ((i & (1 << j)) != 0) subset.add(nums[j]);
                }
                subsets.add(subset);
            }
            return subsets;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0078().new Solution();
        Object ans = s.subsets(new int[]{1, 2, 3});
        System.out.println(ans);
    }
}