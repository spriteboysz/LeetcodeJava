package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-10 12:06
 * LastEditTime: 2022-07-10 12:06
 * Description: 2319. 判断矩阵是否是一个 X 矩阵
 */

public class P2319 {
    // code beginning
    class Solution {
        public boolean checkXMatrix(int[][] grid) {
            int n = grid.length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    //if (!(isDiagonal(i, j, n) && grid[i][j] != 0 || !isDiagonal(i, j, n) && grid[i][j] == 0)) {
                    if ((!isDiagonal(i, j, n) || grid[i][j] == 0) && (isDiagonal(i, j, n) || grid[i][j] != 0)) {
                        return false;
                    }
                }
            }
            return true;
        }

        private boolean isDiagonal(int i, int j, int n) {
            return i == j || i + j == n - 1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2319().new Solution();
        Object ans = s.checkXMatrix(new int[][]{{5, 7, 0}, {0, 3, 1}, {0, 5, 0}});
        System.out.println(ans);
    }
}