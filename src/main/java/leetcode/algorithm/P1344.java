package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-13 23:49
 * FileName: src/main/java/leetcode/algorithm
 * Description:1344. 时钟指针的夹角
 */

public class P1344 {
    // code beginning
    class Solution {
        public double angleClock(int hour, int minutes) {
            int angle1 = 6, angle2 = 30;
            int minutes_angle = angle1 * minutes;
            double hour_angle = (hour % 12 + minutes / 60.0) * angle2;
            double diff = Math.abs(hour_angle - minutes_angle);
            return Math.min(diff, 360 - diff);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1344().new Solution();
        var ans = s.angleClock(3, 15);
        System.out.println(ans);
    }
}
