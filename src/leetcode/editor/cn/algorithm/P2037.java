package leetcode.editor.cn.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-01 23:02
 * LastEditTime: 2022-07-01 23:02
 * Description: 2037. 使每位学生都有座位的最少移动次数
 */

public class P2037 {
    // code beginning
    class Solution {
        public int minMovesToSeat(int[] seats, int[] students) {
            Arrays.sort(seats);
            Arrays.sort(students);
            int count = 0;
            for (int i = 0; i < seats.length; i++) {
                count += Math.abs(seats[i] - students[i]);
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2037().new Solution();
        Object ans = s.minMovesToSeat(new int[]{2, 2, 6, 6}, new int[]{1, 3, 2, 6});
        System.out.println(ans);
    }
}