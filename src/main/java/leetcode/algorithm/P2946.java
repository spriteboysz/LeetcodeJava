package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-12-30 20:01
 * FileName: src/main/java/leetcode/algorithm
 * Description: 2946. 循环移位后的矩阵相似检查
 */

public class P2946 {
    // code beginning
    class Solution {
        public boolean areSimilar(int[][] mat, int k) {
            int n = mat[0].length;
            k %= n;
            if (k == 0) {
                return true;
            }
            for (int[] row : mat) {
                for (int j = 0; j < n; j++) {
                    if (row[j] != row[(j + k) % n]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2946().new Solution();
        var ans = s.areSimilar(new int[][]{{1, 2, 1, 2}, {5, 5, 5, 5}, {6, 3, 6, 3}}, 2);
        System.out.println(ans);
    }
}
