package leetcode.editor.cn.algorithm;

import java.util.HashSet;

/**
 * Author: Deean
 * Date: 2022-06-26 22:33
 * LastEditTime: 2022-06-26 22:33
 * Description: .
 */

public class P0217 {
    // code beginning
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num);
            }
            return nums.length != set.size();
        }
    }

    public static void main(String[] args) {
        Solution s = new P0217().new Solution();
        Object ans = s.containsDuplicate(new int[]{1, 2, 3, 4});
        System.out.println(ans);
    }
}