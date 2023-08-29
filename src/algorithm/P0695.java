package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-29 22:30
 * LastEditTime: 2022-07-29 22:30
 * Description: .
 */

public class P0695 {
    // code beginning
    class Solution {
        int[][] grid;
        int m, n;

        public int maxAreaOfIsland(int[][] grid) {
            this.grid = grid;
            this.m = grid.length;
            this.n = grid[0].length;
            int max = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    max = Math.max(max, dfs(i, j));
                }
            }
            return max;
        }

        private int dfs(int x, int y) {
            if (x < 0 || y < 0 || x >= m || y >= n || grid[x][y] != 1) return 0;
            grid[x][y] = 0;
            int[] dx = {0, 0, 1, -1}, dy = {1, -1, 0, 0};
            int area = 1;
            for (int i = 0; i < 4; i++) {
                area += dfs(x + dx[i], y + dy[i]);
            }
            return area;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0695().new Solution();
        Object ans = s.maxAreaOfIsland(new int[][]
                {
                        {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                        {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                        {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
                });
        System.out.println(ans);
    }
}