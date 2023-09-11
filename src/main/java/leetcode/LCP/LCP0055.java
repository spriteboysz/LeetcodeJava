package leetcode.LCP;

/**
 * Author: Deean
 * Date: 2022-07-14 23:35
 * LastEditTime: 2022-07-14 23:35
 * Description: leetcode.LCP 55. 采集果实
 */

public class LCP0055 {
    // code beginning
    class Solution {
        public int getMinimumTime(int[] time, int[][] fruits, int limit) {
            int times = 0;
            for (int[] fruit : fruits) {
                times += time[fruit[0]] * Math.ceil(fruit[1] * 1.0d / limit);
            }
            return times;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCP0055().new Solution();
        Object ans = s.getMinimumTime(new int[]{1}, new int[][]{{0, 3}, {0, 5}}, 2);
        System.out.println(ans);
    }
}