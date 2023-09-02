package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-17 11:25
 * LastEditTime: 2022-07-17 11:25
 * Description: 1828. 统计一个圆中点的数目
 */

public class P1828 {
    // code beginning
    class Solution {
        public int[] countPoints(int[][] points, int[][] queries) {
            int[] count = new int[queries.length];
            for (int i = 0; i < queries.length; i++) {
                for (int[] point : points) {
                    int x = point[0], y = point[1];
                    int m = queries[i][0], n = queries[i][1], r = queries[i][2];
                    if ((x - m) * (x - m) + (y - n) * (y - n) <= r * r) count[i]++;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1828().new Solution();
        int[] ans = s.countPoints(new int[][]{{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}}, new int[][]{{1, 2, 2}, {2, 2, 2},
                {4, 3, 2}, {4, 3, 3}});
        System.out.println(Arrays.toString(ans));
    }
}