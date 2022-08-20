package leetcode.editor.cn.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-20 21:43
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1503. 所有蚂蚁掉下来前的最后一刻
 */

public class P1503 {
    // code beginning
    class Solution {
        public int getLastMoment(int n, int[] left, int[] right) {
            Arrays.sort(left);
            Arrays.sort(right);
            if (left.length == 0) return n - right[0];
            if (right.length == 0) return left[left.length - 1];
            return Math.max(left[left.length - 1], n - right[0]);

        }
    }

    public static void main(String[] args) {
        Solution s = new P1503().new Solution();
        Object ans = s.getLastMoment(7, new int[]{}, new int[]{0, 1, 2, 3, 4, 5, 6, 7});
        System.out.println(ans);
    }
}