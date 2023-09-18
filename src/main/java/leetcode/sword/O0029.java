package leetcode.sword;

import leetcode.common.Utils;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-16 21:47
 * FileName: src/main/java/leetcode/sword
 * Description:剑指 Offer 29. 顺时针打印矩阵
 */

public class O0029 {
    // code beginning
    class Solution {
        public int[] spiralOrder(int[][] matrix) {
            int m = matrix.length;
            if (m == 0) return new int[]{};
            int n = matrix[0].length;
            int left = 0, right = n - 1, top = 0, bottom = m - 1, pos = 0;
            int[] nums = new int[m * n];
            while (true) {
                for (int i = left; i <= right; i++) {
                    nums[pos++] = matrix[top][i];
                }
                top++;
                if (top > bottom) break;
                for (int i = top; i <= bottom; i++) {
                    nums[pos++] = matrix[i][right];
                }
                right--;
                if (left > right) break;
                for (int i = right; i >= left; i--) {
                    nums[pos++] = matrix[bottom][i];
                }
                bottom--;
                if (top > bottom) break;
                for (int i = bottom; i >= top; i--) {
                    nums[pos++] = matrix[i][left];
                }
                left++;
                if (left > right) break;
            }
            return nums;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0029().new Solution();
        var ans = s.spiralOrder(Utils.to2DArray("[[1,2,3,4],[5,6,7,8],[9,10,11,12]]"));
        System.out.println(Arrays.toString(ans));
    }
}
