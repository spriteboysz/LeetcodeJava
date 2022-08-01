package leetcode.editor.cn.sword;

/**
 * Author: Deean
 * Date: 2022-08-01 23:21
 * LastEditTime: 2022-08-01 23:21
 * Description: 剑指 Offer 12. 矩阵中的路径
 */

public class O0012 {
    // code beginning
    class Solution {
        public boolean exist(char[][] board, String word) {
            int n = board.length, m = board[0].length;
            boolean[][] visited = new boolean[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (check(board, visited, i, j, word, 0)) return true;
                }
            }
            return false;
        }

        public boolean check(char[][] board, boolean[][] visited, int i, int j, String s, int k) {
            if (board[i][j] != s.charAt(k)) return false;
            if (k == s.length() - 1) return true;
            visited[i][j] = true;
            int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
            boolean result = false;
            for (int[] dir : directions) {
                int di = i + dir[0], dj = j + dir[1];
                if (di >= 0 && di < board.length && dj >= 0 && dj < board[0].length) {
                    if (!visited[di][dj] && check(board, visited, di, dj, s, k + 1)) {
                        result = true;
                        break;
                    }
                }
            }
            visited[i][j] = false;
            return result;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0012().new Solution();
        Object ans = s.exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCCED");
        System.out.println(ans);
    }
}