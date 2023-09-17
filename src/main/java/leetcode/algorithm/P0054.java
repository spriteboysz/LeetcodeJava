package leetcode.algorithm;

import leetcode.common.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-16 21:56
 * FileName: src/main/java/leetcode/algorithm
 * Description:54. 螺旋矩阵
 */

public class P0054 {
    // code beginning
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            int m = matrix.length;
            if (m == 0) return new ArrayList<>();
            int n = matrix[0].length;
            int top = 0, bottom = m - 1, left = 0, right = n - 1;
            List<Integer> nums = new ArrayList<>();
            while (true) {
                for (int i = left; i <= right; i++) {
                    nums.add(matrix[top][i]);
                }
                top++;
                if (top > bottom) break;
                for (int i = top; i <= bottom; i++) {
                    nums.add(matrix[i][right]);
                }
                right--;
                if (left > right) break;
                for (int i = right; i >= left; i--) {
                    nums.add(matrix[bottom][i]);
                }
                bottom--;
                if (top > bottom) break;
                for (int i = bottom; i >= top; i--) {
                    nums.add(matrix[i][left]);
                }
                left++;
                if (left > right) break;
            }
            return nums;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0054().new Solution();
        var ans = s.spiralOrder(Utils.to2DArray("[[1,2,3,4],[5,6,7,8],[9,10,11,12]]"));
        System.out.println(ans);
    }
}
