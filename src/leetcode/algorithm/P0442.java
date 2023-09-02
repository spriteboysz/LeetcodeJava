package leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-25 23:58
 * LastEditTime: 2022-07-25 23:58
 * Description: 442. 数组中重复的数据
 */

public class P0442 {
    // code beginning
    class Solution {
        public List<Integer> findDuplicates(int[] nums) {
            List<Integer> duplicates = new ArrayList<>();
            for (int num : nums) {
                if (nums[Math.abs(num) - 1] < 0) {
                    duplicates.add(Math.abs(num));
                } else {
                    nums[Math.abs(num) - 1] *= -1;
                }
            }
            return duplicates;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0442().new Solution();
        Object ans = s.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        System.out.println(ans);
    }
}