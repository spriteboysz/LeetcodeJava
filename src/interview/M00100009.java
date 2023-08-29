package interview;

/**
 * Author: Deean
 * Date: 2023-08-29 17:30
 * FileName: src/interview
 * Description:
 */

public class M00100009 {
    // code beginning
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            for (int[] row : matrix) {
                for (int num : row) {
                    if (num == target) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00100009().new Solution();
        Object ans = s.searchMatrix(new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}}, 5);
        System.out.println(ans);
    }
}
