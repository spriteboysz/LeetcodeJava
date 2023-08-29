package algorithm;

/**
 * Author: Deean
 * Date: 2022-08-06 15:08
 * Description: 999. 可以被一步捕获的棋子数
 */

public class P0999 {
    // code beginning
    class Solution {
        public int numRookCaptures(char[][] board) {
            int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
            int count = 0, x = 0, y = 0;
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (board[i][j] == 'R') {
                        x = i;
                        y = j;
                    }
                }
            }
            for (int[] direction : directions) {
                int dx = x, dy = y;
                while (true) {
                    dx += direction[0];
                    dy += direction[1];
                    if (dx < 0 || dy < 0 || dx >= 8 || dy >= 8 || board[dx][dy] == 'B') break;
                    if (board[dx][dy] == 'p') {
                        count++;
                        break;
                    }
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0999().new Solution();
        Object ans = s.numRookCaptures(new char[][]{
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'p', 'p', '.', 'R', '.', 'p', 'B', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'B', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}});
        System.out.println(ans);
    }
}