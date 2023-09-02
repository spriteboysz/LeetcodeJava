package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-30 22:04
 * LastEditTime: 2022-07-30 22:04
 * Description: 1905. 统计子岛屿
 */

public class P1905 {
    // code beginning
    class Solution {
        int[][] grid1, grid2;
        int m, n;
        boolean flag = false;

        public int countSubIslands(int[][] grid1, int[][] grid2) {
            this.grid1 = grid1;
            this.grid2 = grid2;
            this.m = grid1.length;
            this.n = grid1[0].length;
            int count = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid2[i][j] == 1) {
                        flag = true;
                        dfs(i, j);
                        if (flag) count++;
                    }
                }
            }
            return count;
        }

        private void dfs(int x, int y) {
            if (x < 0 || y < 0 || x >= m || y >= n || grid2[x][y] == 0) return;
            grid2[x][y] = 0;
            if (grid1[x][y] == 0) flag = false;
            int[] dx = {0, 0, 1, -1}, dy = {1, -1, 0, 0};
            for (int i = 0; i < 4; i++) {
                dfs(x + dx[i], y + dy[i]);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P1905().new Solution();
        Object ans = s.countSubIslands(new int[][]{
                        {1, 0, 1, 0, 1},
                        {1, 1, 1, 1, 1},
                        {0, 0, 0, 0, 0},
                        {1, 1, 1, 1, 1},
                        {1, 0, 1, 0, 1}
                },
                new int[][]{
                        {0, 0, 0, 0, 0},
                        {1, 1, 1, 1, 1},
                        {0, 1, 0, 1, 0},
                        {0, 1, 0, 1, 0},
                        {1, 0, 0, 0, 1}
                });
        System.out.println(ans);
    }
}