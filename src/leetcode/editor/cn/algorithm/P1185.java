package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-11 23:14
 * LastEditTime: 2022-07-11 23:14
 * Description: 1185. 一周中的第几天
 */

public class P1185 {
    // code beginning
    class Solution {
        public String dayOfTheWeek(int day, int month, int year) {
            String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
            int days = 4;
            for (int i = 1971; i < year; i++) {
                days += isLeap(i) ? 366 : 365;
            }
            for (int i = 1; i < month; i++) {
                days += monthDays[i - 1];
                if (i == 2 && isLeap(year)) days++;
            }
            days += day;
            return week[days % 7];
        }

        private boolean isLeap(int year) {
            return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1185().new Solution();
        Object ans = s.dayOfTheWeek(18, 7, 1999);
        System.out.println(ans);
        ans = s.dayOfTheWeek(11, 7, 2022);  // monday
        System.out.println(ans);
    }
}