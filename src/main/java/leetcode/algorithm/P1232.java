package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-15 23:31
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 1232. 缀点成线
 */

public class P1232 {
    // code beginning
    class Solution {
        public boolean checkStraightLine(int[][] coordinates) {
            int deltaX = coordinates[0][0], deltaY = coordinates[0][1];
            for (int i = 0; i < coordinates.length; i++) {
                coordinates[i][0] -= deltaX;
                coordinates[i][1] -= deltaY;
            }
            int a = coordinates[1][1], b = -coordinates[1][0];
            for (int i = 2; i < coordinates.length; i++) {
                int x = coordinates[i][0], y = coordinates[i][1];
                if (a * x + b * y != 0) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1232().new Solution();
        Object ans = s.checkStraightLine(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}});
        System.out.println(ans);
        ans = s.checkStraightLine(new int[][]{{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}});
        System.out.println(ans);
    }
}