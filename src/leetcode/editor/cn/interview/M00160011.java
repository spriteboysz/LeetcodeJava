package leetcode.editor.cn.interview;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-12 23:39
 * LastEditTime: 2022-07-12 23:39
 * Description: 面试题 16.11. 跳水板
 */

public class M00160011 {
    // code beginning
    class Solution {
        public int[] divingBoard(int shorter, int longer, int k) {
            if (k == 0) return new int[0];
            if (shorter == longer) return new int[]{shorter * k};
            int[] lengths = new int[k + 1];
            for (int i = 0; i <= k; i++) {
                lengths[i] = shorter * (k - i) + longer * i;
            }
            return lengths;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00160011().new Solution();
        int[] ans = s.divingBoard(1, 2, 3);
        System.out.println(Arrays.toString(ans));
    }
}