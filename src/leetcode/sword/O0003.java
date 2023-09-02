package leetcode.sword;

import java.util.HashSet;

/**
 * Author: Deean
 * Date: 2022-07-10 17:31
 * LastEditTime: 2022-07-10 17:31
 * Description: 剑指 Offer 03. 数组中重复的数字
 */

public class O0003 {
    // code beginning
    class Solution {
        public int findRepeatNumber(int[] nums) {
            HashSet<Integer> hashSet = new HashSet<>();
            for (int num : nums) {
                if (hashSet.contains(num)) return num;
                hashSet.add(num);
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0003().new Solution();
        Object ans = s.findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3});
        System.out.println(ans);
    }
}