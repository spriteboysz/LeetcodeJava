package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-14 22:37
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 485. 最大连续 1 的个数
 */

public class P0485 {
    // code beginning
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int max = 0, count = 0;
            for (int num : nums) {
                if (num == 1) {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 0;
                }
            }
            return Math.max(max, count);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0485().new Solution();
        Object ans = s.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1});
        System.out.println(ans);
    }
}