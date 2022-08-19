package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-19 00:05
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1886. 判断矩阵经轮转后是否一致
 */

public class P1886 {
    // code beginning
    class Solution {
        public boolean findRotation(int[][] mat, int[][] target) {
            int n = mat.length, count = 0;
            degree0:
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (mat[i][j] != target[i][j]) {
                        count++;
                        break degree0;
                    }
                }
            }

            degree90:
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (mat[i][j] != target[j][n - i - 1]) {
                        count++;
                        break degree90;
                    }
                }
            }

            degree180:
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (mat[i][j] != target[n - i - 1][n - j - 1]) {
                        count++;
                        break degree180;
                    }
                }
            }

            degree270:
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (mat[i][j] != target[n - j - 1][i]) {
                        count++;
                        break degree270;
                    }
                }
            }
            return count < 4;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1886().new Solution();
        Object ans = s.findRotation(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}},
                new int[][]{{1, 1, 1}, {0, 1, 0}, {0, 0, 0}});
        System.out.println(ans);
    }
}