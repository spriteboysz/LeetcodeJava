package leetcode.sword;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-29 23:57
 * LastEditTime: 2022-07-29 23:57
 * Description: .
 */

public class OII0100 {
    // code beginning
    class Solution {
        public int minimumTotal(List<List<Integer>> triangle) {
            int n = triangle.size();
            int[][] cost = new int[n][n];
            cost[0][0] = triangle.get(0).get(0);
            for (int i = 1; i < n; ++i) {
                cost[i][0] = cost[i - 1][0] + triangle.get(i).get(0);
                for (int j = 1; j < i; ++j) {
                    cost[i][j] = Math.min(cost[i - 1][j - 1], cost[i - 1][j]) + triangle.get(i).get(j);
                }
                cost[i][i] = cost[i - 1][i - 1] + triangle.get(i).get(i);
            }
            int min = cost[n - 1][0];
            for (int i = 1; i < n; ++i) {
                min = Math.min(min, cost[n - 1][i]);
            }
            return min;
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0100().new Solution();
        // [[2],[3,4],[6,5,7],[4,1,8,3]]
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(List.of(2));
        triangle.add(List.of(3, 4));
        triangle.add(List.of(6, 5, 7));
        triangle.add(List.of(4, 1, 8, 3));
        Object ans = s.minimumTotal(triangle);
        System.out.println(ans);
    }
}