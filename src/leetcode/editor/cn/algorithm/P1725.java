package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-06-30 23:36
 * LastEditTime: 2022-06-30 23:36
 * Description: 1725. 可以形成最大正方形的矩形数目
 */

public class P1725 {
    // code beginning
    class Solution {
        public int countGoodRectangles(int[][] rectangles) {
            int[] sides = new int[rectangles.length];
            int max = 0, count = 0;
            for (int i = 0; i < rectangles.length; i++) {
                sides[i] = Math.min(rectangles[i][0], rectangles[i][1]);
                max = Math.max(max, sides[i]);
            }
            for (int side : sides) {
                if (side == max) count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1725().new Solution();
        Object ans = s.countGoodRectangles(new int[][]{{2, 3}, {3, 7}, {4, 3}, {3, 7}});
        System.out.println(ans);
    }
}