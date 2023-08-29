package sword;

/**
 * Author: Deean
 * Date: 2022-08-01 23:06
 * LastEditTime: 2022-08-01 23:06
 * Description: 剑指 Offer 04. 二维数组中的查找
 */

public class O0004 {
    // code beginning
    class Solution {
        public boolean findNumberIn2DArray(int[][] matrix, int target) {
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
        Solution s = new O0004().new Solution();
        Object ans = s.findNumberIn2DArray(new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        }, 5);
        System.out.println(ans);
    }
}