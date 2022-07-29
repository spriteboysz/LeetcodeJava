package leetcode.editor.cn.sword;

/**
 * Author: Deean
 * Date: 2022-07-29 22:19
 * LastEditTime: 2022-07-29 22:19
 * Description: 剑指 Offer II 105. 岛屿的最大面积
 */

public class OII0105 {
    // code beginning
    class Solution {
        int[][] grid;

        public int maxAreaOfIsland(int[][] grid) {
            this.grid = grid;
            int m = grid.length, n = grid[0].length, max = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    max = Math.max(max, dfs(i, j));
                }
            }
            return max;
        }

        private int dfs(int x, int y) {
            int m = grid.length, n = grid[0].length, area = 1;
            if (x < 0 || y < 0 || x >= m || y >= n || grid[x][y] != 1) return 0;
            grid[x][y] = 0;
            int[] dx = {0, 0, 1, -1}, dy = {1, -1, 0, 0};
            for (int i = 0; i < 4; i++) {
                area += dfs(x + dx[i], y + dy[i]);
            }
            return area;
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0105().new Solution();
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