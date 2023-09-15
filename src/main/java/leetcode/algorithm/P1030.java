package leetcode.algorithm;

import java.util.*;

/**
 * Author: Deean
 * Date: 2023-09-14 23:42
 * FileName: src/main/java/leetcode/algorithm
 * Description:1030. 距离顺序排列矩阵单元格
 */

public class P1030 {
    // code beginning
    class Solution {
        public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
            Map<Integer, List<int[]>> map = new HashMap<>();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    int distance = Math.abs(i - rCenter) + Math.abs(j - cCenter);
                    List<int[]> list = map.getOrDefault(distance, new ArrayList<>());
                    list.add(new int[]{i, j});
                    map.put(distance, list);
                }
            }
            int[][] cells = new int[rows * cols][2];
            for (int i = 0, pos = 0; i < rows * cols; i++) {
                for (int[] cell : map.getOrDefault(i, new ArrayList<>())) {
                    cells[pos++] = cell;
                }
            }
            return cells;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1030().new Solution();
        var ans = s.allCellsDistOrder(2, 3, 1, 2);
        System.out.println(Arrays.deepToString(ans));
    }
}
