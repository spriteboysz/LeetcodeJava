package leetcode.algorithm;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Author: Deean
 * Date: 2022-07-23 15:38
 * LastEditTime: 2022-07-23 15:38
 * Description: 539. 最小时间差
 */

public class P0539 {
    // code beginning
    class Solution {
        public int findMinDifference(List<String> timePoints) {
            Set<Integer> minutes = new TreeSet<>();
            for (String point : timePoints) {
                String[] time = point.split(":");
                int cur = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
                if (minutes.contains(cur)) {
                    return 0;
                } else {
                    minutes.add(cur);
                    minutes.add(cur + 60 * 24);
                }
            }

            int min = 24 * 60 + 1, pre = -24 * 60 - 1;
            for (Integer minute : minutes) {
                min = Math.min(min, minute - pre);
                pre = minute;
            }
            return min;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0539().new Solution();
        Object ans = s.findMinDifference(List.of(new String[]{"00:00", "23:59", "00:00"}));
        System.out.println(ans);
        ans = s.findMinDifference(List.of(new String[]{"00:00", "23:59"}));
        System.out.println(ans);
    }
}