package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-19 23:05
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 733. 图像渲染
 */

public class P0733 {
    // code beginning
    class Solution {
        int[] dx = {1, 0, 0, -1}, dy = {0, 1, -1, 0};

        public int[][] floodFill(int[][] image, int sr, int sc, int color) {
            if (image[sr][sc] != color) {
                dfs(image, sr, sc, color, image[sr][sc]);
            }
            return image;
        }

        private void dfs(int[][] image, int x, int y, int color, int old) {
            if (image[x][y] != old) return;
            image[x][y] = color;
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i], ny = y + dy[i];
                if (nx < 0 || nx >= image.length || ny < 0 || ny >= image[0].length) continue;
                dfs(image, nx, ny, color, old);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P0733().new Solution();
        int[][] ans = s.floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2);
        for (int[] row : ans) System.out.println(Arrays.toString(row));
    }
}