package leetcode.editor.cn.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-01 23:31
 * LastEditTime: 2022-07-01 23:31
 * Description: 1051. 高度检查器
 */

public class P1051 {
    // code beginning
    class Solution {
        public int heightChecker(int[] heights) {
            int n = heights.length, count = 0;
            int[] expected = new int[n];
            System.arraycopy(heights, 0, expected, 0, n);
            Arrays.sort(expected);
            for (int i = 0; i < heights.length; i++) {
                if (expected[i] != heights[i]) count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1051().new Solution();
        Object ans = s.heightChecker(new int[]{5, 1, 2, 3, 4});
        System.out.println(ans);
    }
}