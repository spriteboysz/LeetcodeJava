package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-19 22:40
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 661. 图片平滑器
 */

public class P0661 {
    // code beginning
    class Solution {
        public int[][] imageSmoother(int[][] img) {
            int n = img.length, m = img[0].length;
            int[][] smooth = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    smooth[i][j] = dfs(img, i, j, n, m);
                }
            }
            return smooth;
        }

        private int dfs(int[][] img, int x, int y, int n, int m) {
            int sum = 0, count = 0;
            for (int dx = -1; dx <= 1; dx++) {
                for (int dy = -1; dy <= 1; dy++) {
                    if (x + dx < 0 || x + dx >= n || y + dy < 0 || y + dy >= m) continue;
                    sum += img[x + dx][y + dy];
                    count++;
                }
            }
            return sum / count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0661().new Solution();
        int[][] ans = s.imageSmoother(new int[][]{{100, 200, 100}, {200, 50, 200}, {100, 200, 100}});
        for (int[] row : ans) System.out.println(Arrays.toString(row));
    }
}