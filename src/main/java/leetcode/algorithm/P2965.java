package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-12-30 19:10
 * FileName: src/main/java/leetcode/algorithm
 * Description: 2965. 找出缺失和重复的数字
 */

public class P2965 {
    // code beginning
    class Solution {
        public int[] findMissingAndRepeatedValues(int[][] grid) {
            int n = (int) Math.pow(grid.length, 2);
            int[] count = new int[n];
            for (int[] row : grid) {
                for (int num : row) {
                    count[num - 1] += 1;
                }
            }
            int a = -1, b = -1;
            for (int i = 0; i < n; i++) {
                if (count[i] == 2) {
                    a = i + 1;
                } else if (count[i] == 0) {
                    b = i + 1;
                }
            }
            return new int[]{a, b};
        }
    }

    public static void main(String[] args) {
        Solution s = new P2965().new Solution();
        var ans = s.findMissingAndRepeatedValues(new int[][]{{9, 1, 7}, {8, 9, 2}, {3, 4, 6}});
        System.out.println(Arrays.toString(ans));
    }
}
