package algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-09 23:08
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 130. 被围绕的区域
 */

public class P0130 {
    // code beginning
    class Solution {
        char[][] board;

        public void solve(char[][] board) {
            this.board = board;
            int n = board.length, m = board[0].length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if ((i == 0 || i == n - 1 || j == 0 || j == m - 1) && board[i][j] == 'O') {
                        dfs(i, j);
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (board[i][j] == 'O') board[i][j] = 'X';
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (board[i][j] == 'A') board[i][j] = 'O';
                }
            }

            for (char[] row : board) System.out.println(Arrays.toString(row));

        }

        private void dfs(int x, int y) {
            int n = board.length, m = board[0].length;
            if (x < 0 || y < 0 || x >= n || y >= m || board[x][y] != 'O') return;
            board[x][y] = 'A';
            int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
            for (int[] direction : directions) {
                dfs(x + direction[0], y + direction[1]);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P0130().new Solution();
        s.solve(new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}});
    }
}