package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2024-06-28 23:03
 * FileName: src/main/java/leetcode/algorithm
 * Description: 3127. 构造相同颜色的正方形
 */

public class P3127 {
    // code beginning
    class Solution {
        public boolean canMakeSquare(char[][] grid) {
            for (int i = 0; i < 2; ++i) {
                for (int j = 0; j < 2; ++j) {
                    int b = 0, w = 0;
                    if (grid[i][j] == 'B') {
                        b++;
                    } else {
                        w++;
                    }
                    if (grid[i + 1][j] == 'B') {
                        b++;
                    } else {
                        w++;
                    }
                    if (grid[i][j + 1] == 'B') {
                        b++;
                    } else {
                        w++;
                    }
                    if (grid[i + 1][j + 1] == 'B') {
                        b++;
                    } else {
                        w++;
                    }
                    if (w >= 3 || b >= 3) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new P3127().new Solution();
        var ans = s.canMakeSquare(new char[][]{{'B', 'W', 'B'}, {'B', 'W', 'W'}, {'B', 'W', 'B'}});
        System.out.println(ans);
    }
}
