package leetcode.interview;

import leetcode.common.Utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2023-09-16 23:16
 * FileName: src/main/java/leetcode/interview
 * Description:面试题 01.08. 零矩阵
 */

public class M00010008 {
    // code beginning
    class Solution {
        public void setZeroes(int[][] matrix) {
            int m = matrix.length, n = matrix[0].length;
            Set<Integer> rows = new HashSet<>();
            Set<Integer> cols = new HashSet<>();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == 0) {
                        rows.add(i);
                        cols.add(j);
                    }
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (rows.contains(i) || cols.contains(j)) {
                        matrix[i][j] = 0;
                    }
                }
            }
            System.out.println(Arrays.deepToString(matrix));
        }
    }

    public static void main(String[] args) {
        Solution s = new M00010008().new Solution();
        s.setZeroes(Utils.to2DArray("[[1,1,1],[1,0,1],[1,1,1]]"));
        System.out.println();
    }
}
