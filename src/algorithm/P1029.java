package algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-25 22:55
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1029. 两地调度
 */

public class P1029 {
    // code beginning
    class Solution {
        public int twoCitySchedCost(int[][] costs) {
            Arrays.sort(costs, (o1, o2) -> o1[0] - o1[1] - (o2[0] - o2[1]));
            int total = 0;
            for (int i = 0; i < costs.length / 2; i++) {
                total += costs[i][0] + costs[i + costs.length / 2][1];
            }
            return total;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1029().new Solution();
        Object ans = s.twoCitySchedCost(new int[][]{{515, 563}, {451, 713}, {537, 709}, {343, 819}, {855, 779}, {457, 60}, {650, 359}, {631, 42}});
        System.out.println(ans);
    }
}