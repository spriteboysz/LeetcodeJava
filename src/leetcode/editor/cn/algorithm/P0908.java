package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-10 11:42
 * LastEditTime: 2022-07-10 11:42
 * Description: 908. 最小差值 I
 */

public class P0908 {
    // code beginning
    class Solution {
        public int smallestRangeI(int[] nums, int k) {
            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
            for (int num : nums) {
                max = Math.max(max, num);
                min = Math.min(min, num);
            }
            return Math.max((max - k - min - k), 0);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0908().new Solution();
        Object ans = s.smallestRangeI(new int[]{1, 3, 6}, 3);
        System.out.println(ans);
    }
}