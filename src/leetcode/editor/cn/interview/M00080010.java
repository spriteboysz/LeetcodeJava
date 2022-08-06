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
        int oldColor, n, m;

        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            this.oldColor = image[sr][sc];
            this.n = image.length;
            this.m = image[0].length;
            dfs(image, sr, sc, newColor);
            return image;
        }

        private void dfs(int[][] image, int sr, int sc, int newColor) {
            if (sr < 0 || sc < 0 || sr >= n || sc >= m || image[sr][sc] != oldColor) return;
            int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
            for (int[] direction : directions) {
                image[sr][sc] = newColor;
                sr += direction[0];
                sc += direction[1];
                dfs(image, sr, sc, newColor);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new M00080010().new Solution();
        int[][] ans = s.floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2);
        for (int[] row : ans) System.out.println(Arrays.toString(row));
    }
}