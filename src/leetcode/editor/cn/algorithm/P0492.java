package leetcode.editor.cn.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-06 19:23
 * Description: 492. 构造矩形
 */

public class P0492 {
    // code beginning
    class Solution {
        public int[] constructRectangle(int area) {
            int init = (int) Math.sqrt(area);
            for (int i = init; i >= 1; i--) {
                if (area % i == 0) return new int[]{area / i, i};
            }
            return new int[]{-1, -1};
        }
    }

    public static void main(String[] args) {
        Solution s = new P0492().new Solution();
        int[] ans = s.constructRectangle(37);
        System.out.println(Arrays.toString(ans));
        ans = s.constructRectangle(122122);
        System.out.println(Arrays.toString(ans));
    }
}