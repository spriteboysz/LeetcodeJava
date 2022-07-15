package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-15 22:19
 * LastEditTime: 2022-07-15 22:19
 * Description: 812. 最大三角形面积
 */

public class P0812 {
    // code beginning
    class Solution {
        public double largestTriangleArea(int[][] points) {
            double maxArea = 0;
            for (int i = 0; i < points.length - 2; i++) {
                for (int j = i + 1; j < points.length - 1; j++) {
                    for (int k = j + 1; k < points.length; k++) {
                        int x1 = points[i][0], y1 = points[i][1];
                        int x2 = points[j][0], y2 = points[j][1];
                        int x3 = points[k][0], y3 = points[k][1];
                        maxArea = Math.max(maxArea, Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)));
                    }
                }
            }
            return maxArea * 0.5;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0812().new Solution();
        Object ans = s.largestTriangleArea(new int[][]{{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}});
        System.out.println(ans);
    }
}