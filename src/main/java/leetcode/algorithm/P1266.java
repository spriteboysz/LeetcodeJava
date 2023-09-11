package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-01 22:20
 * LastEditTime: 2022-07-01 22:20
 * Description: 1266. 访问所有点的最小时间
 */

public class P1266 {
    // code beginning
    class Solution {
        public int minTimeToVisitAllPoints(int[][] points) {
            int time = 0;
            for (int i = 1; i < points.length; i++) {
                time += Math.max(Math.abs(points[i][0] - points[i - 1][0]), Math.abs(points[i][1] - points[i - 1][1]));
            }
            return time;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1266().new Solution();
        Object ans = s.minTimeToVisitAllPoints(new int[][]{{3, 2}, {-2, 2}});
        System.out.println(ans);
    }
}