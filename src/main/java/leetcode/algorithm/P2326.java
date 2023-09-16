package leetcode.algorithm;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-16 22:29
 * FileName: src/main/java/leetcode/algorithm
 * Description:2326. 螺旋矩阵 IV
 */

public class P2326 {
    // code beginning
    class Solution {
        public int[][] spiralMatrix(int m, int n, ListNode head) {
            List<Integer> values = new ArrayList<>();
            while (head != null) {
                values.add(head.val);
                head = head.next;
            }
            int[][] matrix = new int[m][n];
            for (int i = 0; i < m; i++) {
                Arrays.fill(matrix[i], -1);
            }
            int left = 0, right = n - 1, top = 0, bottom = m - 1;
            for (int i = 0, k = values.size(); i < k; ) {
                for (int j = left; i < k && j <= right; j++) {
                    matrix[top][j] = values.get(i++);
                }
                top++;

                for (int j = top; i < k && j <= bottom; j++) {
                    matrix[j][right] = values.get(i++);
                }
                right--;

                for (int j = right; i < k && j >= left; j--) {
                    matrix[bottom][j] = values.get(i++);
                }
                bottom--;

                for (int j = bottom; i < k && j >= top; j--) {
                    matrix[j][left] = values.get(i++);
                }
                left++;
            }
            return matrix;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2326().new Solution();
        var ans = s.spiralMatrix(3, 5, new ListNode("[3,0,2,6,8,1,7,9,4,2,5,5,0]"));
        System.out.println(Arrays.deepToString(ans));
    }
}
