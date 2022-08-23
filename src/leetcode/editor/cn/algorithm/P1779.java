package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-24 00:01
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1779. 找到最近的有相同 X 或 Y 坐标的点
 */

public class P1779 {
    // code beginning
    class Solution {
        public int nearestValidPoint(int x, int y, int[][] points) {
            int minValue = Integer.MAX_VALUE, minIndex = -1;
            for (int i = 0; i < points.length; i++) {
                if (points[i][0] == x || points[i][1] == y) {
                    int cur = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
                    if (cur < minValue) {
                        minValue = cur;
                        minIndex = i;
                    }
                }
            }
            return minIndex;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1779().new Solution();
        Object ans = s.nearestValidPoint(3, 4, new int[][]{{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}});
        System.out.println(ans);
    }
}