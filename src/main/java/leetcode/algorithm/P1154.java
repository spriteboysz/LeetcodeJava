package leetcode.algorithm;


/**
 * Author: Deean
 * Date: 2022-07-13 23:23
 * LastEditTime: 2022-07-13 23:23
 * Description: 1154. 一年中的第几天
 */

public class P1154 {
    // code beginning
    class Solution {
        int[] MONTH = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        public int dayOfYear(String date) {
            String[] dates = date.split("-");
            int year = Integer.parseInt(dates[0]);
            int month = Integer.parseInt(dates[1]);
            int day = Integer.parseInt(dates[2]);
            if (month > 2 && isLeap(year)) MONTH[1] = 29;
            int days = day;
            for (int m = 0; m < month - 1; m++) {
                days += MONTH[m];
            }
            return days;
        }

        private boolean isLeap(int year) {
            return ((year & 3) == 0) && ((year % 100) != 0 || (year % 400) == 0);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1154().new Solution();
        Object ans = s.dayOfYear("2019-02-10");
        System.out.println(ans);
    }
}