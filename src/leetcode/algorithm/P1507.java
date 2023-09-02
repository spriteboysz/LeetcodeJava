package leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-08-06 20:07
 * Description: 1507. 转变日期格式
 */

public class P1507 {
    // code beginning
    class Solution {
        public String reformatDate(String date) {
            String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
            Map<String, Integer> s2month = new HashMap<>();
            for (int i = 1; i <= 12; i++) {
                s2month.put(months[i - 1], i);
            }
            String[] array = date.split(" ");
            int year = Integer.parseInt(array[2]);
            int month = s2month.get(array[1]);
            int day = Integer.parseInt(array[0].substring(0, array[0].length() - 2));
            return String.format("%d-%02d-%02d", year, month, day);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1507().new Solution();
        Object ans = s.reformatDate("6th Jun 1933");
        System.out.println(ans);
    }
}