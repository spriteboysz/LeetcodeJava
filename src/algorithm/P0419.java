package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-17 17:29
 * LastEditTime: 2022-07-17 17:29
 * Description: 419. 甲板上的战舰
 */

public class P0419 {
    // code beginning
    class Solution {
        public int countBattleships(char[][] board) {
            int n = board.length, m = board[0].length, count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (i > 0 && board[i - 1][j] == 'X') continue;
                    if (j > 0 && board[i][j - 1] == 'X') continue;
                    if (board[i][j] == 'X') count++;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0419().new Solution();
        Object ans = s.countBattleships(new char[][]{{'X', '.', '.', 'X'}, {'.', '.', '.', 'X'}, {'.', '.', '.', 'X'}});
        System.out.println(ans);
    }
}