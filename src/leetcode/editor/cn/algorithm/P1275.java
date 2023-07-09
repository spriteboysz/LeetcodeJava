package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-19 23:25
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1275. 找出井字棋的获胜者
 */

public class P1275 {
    // code beginning
    class Solution {
        public String tictactoe(int[][] moves) {
            if (moves.length < 5) return "Pending";
            int[][] board = new int[3][3];
            for (int i = 0; i < moves.length; i++) {
                if (i % 2 == 0) {
                    board[moves[i][0]][moves[i][1]]++;
                } else {
                    board[moves[i][0]][moves[i][1]] += 5;
                }
            }
            int sum;
            for (int i = 0; i < 3; i++) {
                sum = board[i][0] + board[i][1] + board[i][2];
                if (sum == 3) {
                    return "A";
                } else if (sum == 15) {
                    return "B";
                }
            }
            for (int i = 0; i < 3; i++) {
                sum = board[0][i] + board[1][i] + board[2][i];
                if (sum == 3) {
                    return "A";
                } else if (sum == 15) {
                    return "B";
                }
            }
            sum = board[0][0] + board[1][1] + board[2][2];
            if (sum == 3) {
                return "A";
            } else if (sum == 15) {
                return "B";
            }
            sum = board[2][0] + board[1][1] + board[0][2];
            if (sum == 3) {
                return "A";
            } else if (sum == 15) {
                return "B";
            }
            return moves.length < 9 ? "Pending" : "Draw";
        }
    }

    public static void main(String[] args) {
        Solution s = new P1275().new Solution();
        Object ans = s.tictactoe(new int[][]{{0, 0}, {1, 1}, {0, 1}, {0, 2}, {1, 0}, {2, 0}});
        System.out.println(ans);
        ans = s.tictactoe(new int[][]{{0, 0}, {1, 1}, {2, 0}, {1, 0}, {1, 2}, {2, 1}, {0, 1}, {0, 2}, {2, 2}});
        System.out.println(ans);
        ans = s.tictactoe(new int[][]{{0, 0}, {1, 1}});
        System.out.println(ans);
    }
}