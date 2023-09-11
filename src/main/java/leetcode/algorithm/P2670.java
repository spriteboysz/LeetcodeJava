package leetcode.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2023-09-03 18:43
 * FileName: src/leetcode/algorithm
 * Description:2670. 找出不同元素数目差数组
 */

public class P2670 {
    // code beginning
    class Solution {
        public int[] distinctDifferenceArray(int[] nums) {
            Set<Integer> set = new HashSet<>();
            int n = nums.length;
            int[] diff = new int[n];
            for (int i = 0; i < n; i++) {
                set.add(nums[i]);
                diff[i] = set.size();
            }
            set.clear();
            for (int i = n - 1; i >= 0; i--) {
                diff[i] -= set.size();
                set.add(nums[i]);
            }
            return diff;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2670().new Solution();
        Object ans = s.distinctDifferenceArray(new int[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString((int[]) ans));
    }
}
