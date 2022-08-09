package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-09 23:28
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1413. 逐步求和得到正数的最小值
 */

public class P1413 {
    // code beginning
    class Solution {
        public int minStartValue(int[] nums) {
            int pre = 0, min = Integer.MAX_VALUE;
            for (int num : nums) {
                pre += num;
                min = Math.min(min, pre);
            }
            return Math.max(1 - min, 1);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1413().new Solution();
        Object ans = s.minStartValue(new int[]{-3, 2, -3, 4, 2});
        System.out.println(ans);
        ans = s.minStartValue(new int[]{1, 2});
        System.out.println(ans);
    }
}