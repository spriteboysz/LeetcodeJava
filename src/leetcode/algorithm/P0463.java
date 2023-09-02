package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-10 17:04
 * LastEditTime: 2022-07-10 17:04
 * Description: 463. 岛屿的周长
 */

public class P0463 {
    // code beginning
    class Solution {
        public int islandPerimeter(int[][] grid) {
            int[] dx = {0, 1, 0, -1}, dy = {1, 0, -1, 0};
            int n = grid.length, m = grid[0].length, perimeter = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == 1) {
                        int count = 0;
                        for (int k = 0; k < 4; k++) {
                            int x = i + dx[k], y = j + dy[k];
                            if (x < 0 || x >= n || y < 0 || y >= m || grid[x][y] == 0) {
                                count++;
                            }
                        }
                        perimeter += count;
                    }
                }
            }
            return perimeter;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0463().new Solution();
        Object ans = s.islandPerimeter(new int[][]{{1}});   // 4
        System.out.println(ans);
        ans = s.islandPerimeter(new int[][]{{1, 0}});    // 4
        System.out.println(ans);
        ans = s.islandPerimeter(new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}});  // 16
        System.out.println(ans);
    }
}