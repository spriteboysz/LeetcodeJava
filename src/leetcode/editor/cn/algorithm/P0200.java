package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-30 21:45
 * LastEditTime: 2022-07-30 21:45
 * Description: 200. 岛屿数量
 */

public class P0200 {
    // code beginning
    class Solution {
        char[][] grid;
        int m, n;

        public int numIslands(char[][] grid) {
            this.grid = grid;
            this.m = grid.length;
            this.n = grid[0].length;
            int count = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == '1') {
                        dfs(i, j);
                        count++;
                    }
                }
            }
            return count;
        }

        private void dfs(int x, int y) {
            if (x < 0 || y < 0 || x >= m || y >= n || grid[x][y] != '1') return;
            grid[x][y] = '0';
            int[] dx = {0, 0, 1, -1}, dy = {1, -1, 0, 0};
            for (int i = 0; i < 4; i++) {
                dfs(x + dx[i], y + dy[i]);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P0200().new Solution();
        Object ans = s.numIslands(new char[][]
                {
                        {'1', '1', '0', '0', '0'},
                        {'1', '1', '0', '0', '0'},
                        {'0', '0', '1', '0', '0'},
                        {'0', '0', '0', '1', '1'}
                });
        System.out.println(ans);
    }
}