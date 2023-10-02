package leetcode.LCP;

import leetcode.common.Utils;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-30 16:17
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 146. 螺旋遍历二维数组
 */

public class LCR0146 {
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
        Solution s = new LCR0146().new Solution();
        var ans = s.spiralOrder(Utils.to2DArray("[[1,2,3,4],[12,13,14,5],[11,16,15,6],[10,9,8,7]]"));
        System.out.println(Arrays.toString(ans));
    }
}
