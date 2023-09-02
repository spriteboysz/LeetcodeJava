package leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-08-28 10:04
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 1222. 可以攻击国王的皇后
 */

public class P1222 {
    // code beginning
    class Solution {
        List<List<Integer>> attack = new ArrayList<>();

        public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
            char[][] board = new char[8][8];
            for (int[] queen : queens) {
                board[queen[0]][queen[1]] = 'Q';
            }
            int[][] directions = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}, {1, 1}, {-1, 1}, {1, -1}, {-1, -1}};
            for (int[] direction : directions) {
                dfs(board, king[0], king[1], direction);
            }
            return attack;
        }

        private void dfs(char[][] board, int x, int y, int[] direction) {
            if (x < 0 || x > 7 || y < 0 || y > 7) return;
            if (board[x][y] == 'Q') {
                attack.add(Arrays.asList(x, y));
            } else {
                x += direction[0];
                y += direction[1];
                dfs(board, x, y, direction);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P1222().new Solution();
        Object ans = s.queensAttacktheKing(new int[][]{
                {5, 6}, {7, 7}, {2, 1}, {0, 7}, {1, 6}, {5, 1}, {3, 7}, {0, 3}, {4, 0}, {1, 2}, {6, 3}, {5, 0},
                {0, 4}, {2, 2}, {1, 1}, {6, 4}, {5, 4}, {0, 0}, {2, 6}, {4, 5}, {5, 2}, {1, 4}, {7, 5}, {2, 3},
                {0, 5}, {4, 2}, {1, 0}, {2, 7}, {0, 1}, {4, 6}, {6, 1}, {0, 6}, {4, 3}, {1, 7}}, new int[]{3, 4});
        System.out.println(ans);
    }
}