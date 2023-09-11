package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-11 22:07
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 1360. 日期之间隔几天
 */

public class P1360 {
    // code beginning
    class Solution {
        public int daysBetweenDates(String date1, String date2) {
            return Math.abs(calcDays(date1) - calcDays(date2));
        }

        private int calcDays(String date) {
            String[] s = date.split("-");
            int year = Integer.parseInt(s[0]), month = Integer.parseInt(s[1]), day = Integer.parseInt(s[2]);
            int[] MONTH = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int count = day;
            for (int i = 1970; i < year; i++) {
                count += isLeap(i) ? 366 : 365;
            }
            for (int i = 1; i < month; i++) {
                if (i == 2 && isLeap(year)) MONTH[1] = 29;
                count += MONTH[i - 1];
            }
            return count;
        }

        private boolean isLeap(int year) {
            return (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1360().new Solution();
        Object ans = s.daysBetweenDates("2020-01-15", "2019-12-31");
        System.out.println(ans);
    }
}