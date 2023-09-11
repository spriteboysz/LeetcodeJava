package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-15 23:40
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 1037. 有效的回旋镖
 */

public class P1037 {
    // code beginning
    class Solution {
        public boolean isBoomerang(int[][] points) {
            int[] vector1 = {points[1][0] - points[0][0], points[1][1] - points[0][1]};
            int[] vector2 = {points[2][0] - points[0][0], points[2][1] - points[0][1]};
            return vector1[0] * vector2[1] != vector1[1] * vector2[0];
        }
    }

    public static void main(String[] args) {
        Solution s = new P1037().new Solution();
        Object ans = s.isBoomerang(new int[][]{{1, 1}, {2, 3}, {3, 2}});
        System.out.println(ans);
        ans = s.isBoomerang(new int[][]{{1, 1}, {2, 2}, {3, 3}});
        System.out.println(ans);
    }
}