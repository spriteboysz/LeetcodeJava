package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-09 22:24
 * LastEditTime: 2022-07-09 22:24
 * Description: 942. 增减字符串匹配
 */

public class P0942 {
    // code beginning
    class Solution {
        public int[] diStringMatch(String s) {
            int left = 0, right = s.length();
            int[] nums = new int[s.length() + 1];
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'I') {
                    nums[i] = left;
                    left++;
                } else {
                    nums[i] = right;
                    right--;
                }
            }
            nums[s.length()] = left;
            return nums;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0942().new Solution();
        int[] ans = s.diStringMatch("IDID");
        System.out.println(Arrays.toString(ans));
    }
}