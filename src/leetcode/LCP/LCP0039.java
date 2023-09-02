package leetcode.LCP;

/**
 * Author: Deean
 * Date: 2022-07-16 22:03
 * LastEditTime: 2022-07-16 22:03
 * Description: leetcode.LCP 39. 无人机方阵
 */

public class LCP0039 {
    // code beginning
    class Solution {
        public int minimumSwitchingTimes(int[][] source, int[][] target) {
            int n = source.length, m = source[0].length;
            int[] color = new int[10005];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    color[source[i][j]]++;
                    color[target[i][j]]--;
                }
            }
            int count = 0;
            for (int i = 0; i < 10005; i++) {
                if (color[i] > 0) count += color[i];
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCP0039().new Solution();
        Object ans = s.minimumSwitchingTimes(new int[][]{{1, 2, 3}, {3, 4, 5}}, new int[][]{{1, 3, 5}, {2, 3, 4}});
        System.out.println(ans);
    }
}