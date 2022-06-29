package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-06-29 23:19
 * LastEditTime: 2022-06-29 23:19
 * Description: .
 */

public class P2006 {
    // code beginning
    class Solution {
        public int countKDifference(int[] nums, int k) {
            int count = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i; j < nums.length; j++) {
                    if (Math.abs(nums[i] - nums[j]) == k) count++;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2006().new Solution();
        Object ans = s.countKDifference(new int[]{3, 2, 1, 5, 4}, 2);
        System.out.println(ans);
    }
}