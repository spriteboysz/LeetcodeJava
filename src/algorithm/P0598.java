package algorithm;

/**
 * Author: Deean
 * Date: 2022-08-06 22:01
 * Description: 598. 范围求和 II
 */

public class P0598 {
    // code beginning
    class Solution {
        public int maxCount(int m, int n, int[][] ops) {
            for (int[] op : ops) {
                m = Math.min(m, op[0]);
                n = Math.min(n, op[1]);
            }
            return m * n;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0598().new Solution();
        Object ans = s.maxCount(3, 3, new int[][]{{2, 2}, {3, 3}, {3, 3}, {3, 3}, {2, 2}, {3, 3}, {3, 3}, {3, 3}, {2, 2}, {3, 3}, {3, 3}, {3, 3}});
        System.out.println(ans);
    }
}