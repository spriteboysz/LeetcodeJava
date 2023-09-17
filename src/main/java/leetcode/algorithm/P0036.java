package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-16 17:00
 * FileName: src/main/java/leetcode/algorithm
 * Description:36. 有效的数独
 */

public class P0036 {
    // code beginning
    class Solution {
        public boolean isValidSudoku(char[][] board) {
            boolean[][] rows = new boolean[10][10];
            boolean[][] cols = new boolean[10][10];
            boolean[][] grids = new boolean[10][10];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    char c = board[i][j];
                    if (c == '.') continue;
                    int v = c - '0';
                    int index = i / 3 * 3 + j / 3;
                    if (rows[i][v] || cols[j][v] || grids[index][v]) return false;
                    rows[i][v] = cols[j][v] = grids[index][v] = true;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0036().new Solution();
        var ans = s.isValidSudoku(new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        });
        System.out.println(ans);
    }
}
