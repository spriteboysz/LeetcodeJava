package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-01 23:12
 * LastEditTime: 2022-08-01 23:12
 * Description: 240. 搜索二维矩阵 II
 */

public class P0240 {
    // code beginning
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int i = matrix.length - 1, j = 0;
            while (i >= 0 && j < matrix[0].length) {
                if (matrix[i][j] > target) {
                    i--;
                } else if (matrix[i][j] < target) {
                    j++;
                } else {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0240().new Solution();
        Object ans = s.searchMatrix(new int[][]
                {
                        {1, 4, 7, 11, 15},
                        {2, 5, 8, 12, 19},
                        {3, 6, 9, 16, 22},
                        {10, 13, 14, 17, 24},
                        {18, 21, 23, 26, 30}
                }, 10);
        System.out.println(ans);
    }
}