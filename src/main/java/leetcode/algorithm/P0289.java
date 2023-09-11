package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-10 22:06
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 289. 生命游戏
 */

public class P0289 {
    // code beginning
    class Solution {
        public void gameOfLife(int[][] board) {
            int n = board.length, m = board[0].length;
            int[][] clone = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int count = 0;
                    for (int di = -1; di <= 1; di++) {
                        for (int dj = -1; dj <= 1; dj++) {
                            if (di == 0 && dj == 0) continue;
                            if (i + di < 0 || i + di >= n || j + dj < 0 || j + dj >= m) continue;
                            if (board[i + di][j + dj] == 1) count++;
                        }
                    }
                    if (board[i][j] == 1) {
                        if (count < 2 || count > 3) {
                            clone[i][j] = 0;
                        } else {
                            clone[i][j] = 1;
                        }
                    } else {
                        if (count == 3) clone[i][j] = 1;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.arraycopy(clone[i], 0, board[i], 0, m);
                System.out.println(Arrays.toString(board[i]));
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P0289().new Solution();
        s.gameOfLife(new int[][]{{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}});
    }
}