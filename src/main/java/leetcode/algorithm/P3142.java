package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2024-06-28 22:35
 * FileName: src/main/java/leetcode/algorithm
 * Description: 3142. 判断矩阵是否满足条件
 */

public class P3142 {
    // code beginning
    class Solution {
        public boolean satisfiesConditions(int[][] grid) {
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if ((i < grid.length - 1) && (grid[i][j] != grid[i + 1][j])) {
                        return false;
                    }
                    if ((j < grid[0].length - 1) && (grid[i][j] == grid[i][j + 1])) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P3142().new Solution();
        var ans = s.satisfiesConditions(new int[][]{{1, 0, 2}, {1, 0, 2}});
        System.out.println(ans);
    }
}
