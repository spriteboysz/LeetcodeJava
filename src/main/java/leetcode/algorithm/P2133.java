package leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-08-06 23:14
 * Description: 2133. 检查是否每一行每一列都包含全部整数
 */

public class P2133 {
    // code beginning
    class Solution {
        public boolean checkValid(int[][] matrix) {
            int n = matrix.length;
            for (int[] row : matrix) {
                Set<Integer> set = new HashSet<>();
                for (int j = 0; j < n; j++) {
                    set.add(row[j]);
                }
                if (set.size() != n) return false;
            }
            for (int j = 0; j < n; j++) {
                Set<Integer> set = new HashSet<>();
                for (int[] row : matrix) {
                    set.add(row[j]);
                }
                if (set.size() != n) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2133().new Solution();
        Object ans = s.checkValid(new int[][]{{1, 1, 1}, {1, 2, 3}, {1, 2, 3}});
        System.out.println(ans);
    }
}