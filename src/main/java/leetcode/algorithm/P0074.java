package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-02 23:23
 * LastEditTime: 2022-08-02 23:23
 * Description: 74. 搜索二维矩阵
 */

public class P0074 {
    // code beginning
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int m = matrix.length, n = matrix[0].length;
            int left = 0, right = m * n - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2, x = matrix[mid / n][mid % n];
                if (x < target) {
                    left = mid + 1;
                } else if (x > target) {
                    right = mid - 1;
                } else {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0074().new Solution();
        Object ans = s.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 33);
        System.out.println(ans);
    }
}