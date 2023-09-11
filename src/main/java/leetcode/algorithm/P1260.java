package leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-20 21:46
 * LastEditTime: 2022-07-20 21:46
 * Description: 1260. 二维网格迁移
 */

public class P1260 {
    // code beginning
    class Solution {
        public List<List<Integer>> shiftGrid(int[][] grid, int k) {
            List<List<Integer>> shift = new ArrayList<>();
            int m = grid.length, n = grid[0].length;
            for (int i = 0; i < m; i++) {
                List<Integer> row = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    row.add(0);
                }
                shift.add(row);
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int index = (i * n + j + k) % (m * n);
                    shift.get(index / n).set(index % n, grid[i][j]);
                }
            }
            return shift;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1260().new Solution();
        Object ans = s.shiftGrid(new int[][]{{3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}, {12, 0, 21, 13}}, 4);
        System.out.println(ans);
    }
}