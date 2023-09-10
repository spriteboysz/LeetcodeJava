package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-08 20:56
 * FileName: src/leetcode/algorithm
 * Description:2545. 根据第 K 场考试的分数排序
 */

public class P2545 {
    // code beginning
    class Solution {
        public int[][] sortTheStudents(int[][] score, int k) {
            Arrays.sort(score, (a, b) -> b[k] - a[k]);
            return score;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2545().new Solution();
        var ans = s.sortTheStudents(new int[][]{{10, 6, 9, 1}, {7, 5, 11, 2}, {4, 8, 3, 15}}, 2);
        System.out.println(Arrays.deepToString(ans));
    }
}
