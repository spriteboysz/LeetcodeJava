package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-16 23:57
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 674. 最长连续递增序列
 */

public class P0674 {
    // code beginning
    class Solution {
        public int findLengthOfLCIS(int[] nums) {
            int max = 1, cur = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > nums[i - 1]) {
                    cur++;
                    max = Math.max(max, cur);
                } else {
                    cur = 1;
                }
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0674().new Solution();
        Object ans = s.findLengthOfLCIS(new int[]{1, 3, 5, 4, 7});
        System.out.println(ans);
        ans = s.findLengthOfLCIS(new int[]{2, 2, 2, 2, 2});
        System.out.println(ans);
    }
}