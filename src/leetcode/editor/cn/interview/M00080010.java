package leetcode.editor.cn.interview;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-06 23:31
 * Description: 面试题 08.10. 颜色填充
 */

public class M00080010 {
    // code beginning
    class Solution {
        int[][] image;
        int n, m, oldColor, newColor;

        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            this.image = image;
            this.oldColor = image[sr][sc];
            this.newColor = newColor;
            this.n = image.length;
            this.m = image[0].length;
            if (newColor == image[sr][sc]) return image;
            dfs(sr, sc);
            return image;
        }

        private void dfs(int sr, int sc) {
            if (sr < 0 || sc < 0 || sr >= n || sc >= m || image[sr][sc] != oldColor) return;
            image[sr][sc] = newColor;
            dfs(sr - 1, sc);
            dfs(sr + 1, sc);
            dfs(sr, sc - 1);
            dfs(sr, sc + 1);
        }
    }

    public static void main(String[] args) {
        Solution s = new M00080010().new Solution();
        int[][] ans = s.floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2);
        for (int[] row : ans) System.out.println(Arrays.toString(row));
    }
}