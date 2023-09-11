package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-24 16:29
 * LastEditTime: 2022-07-24 16:29
 * Description: 1184. 公交站间的距离
 */

public class P1184 {
    // code beginning
    class Solution {
        public int distanceBetweenBusStops(int[] distance, int start, int destination) {
            if (destination < start) {
                int temp = start;
                start = destination;
                destination = temp;
            }
            int total = 0, sum = 0;
            for (int d : distance) {
                total += d;
            }
            for (int i = start; i < destination; i++) {
                sum += distance[i];
            }
            return Math.min(sum, total - sum);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1184().new Solution();
        Object ans = s.distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 2);
        System.out.println(ans);
        ans = s.distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 3);
        System.out.println(ans);
    }
}