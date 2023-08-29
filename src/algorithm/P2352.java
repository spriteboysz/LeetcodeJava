package algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-08-26 21:51
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2352. 相等行列对
 */

public class P2352 {
    // code beginning
    class Solution {
        public int equalPairs(int[][] grid) {
            Map<String, Integer> rows = new HashMap<>(), cols = new HashMap<>();
            for (int[] row : grid) {
                String key = Arrays.toString(row);
                rows.put(key, rows.getOrDefault(key, 0) + 1);
            }
            for (int j = 0; j < grid.length; j++) {
                int[] col = new int[grid.length];
                for (int i = 0; i < grid.length; i++) {
                    col[i] = grid[i][j];
                }
                String key = Arrays.toString(col);
                cols.put(key, cols.getOrDefault(key, 0) + 1);
            }
            int count = 0;
            for (String key : rows.keySet()) {
                if (cols.containsKey(key)) count += rows.get(key) * cols.get(key);
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2352().new Solution();
        Object ans = s.equalPairs(new int[][]{{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}});
        System.out.println(ans);
    }
}