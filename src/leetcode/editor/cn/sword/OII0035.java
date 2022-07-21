package leetcode.editor.cn.sword;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Author: Deean
 * Date: 2022-07-21 23:36
 * LastEditTime: 2022-07-21 23:36
 * Description: 剑指 Offer II 035. 最小时间差
 */

public class OII0035 {
    // code beginning
    class Solution {
        TreeSet<Integer> minutes = new TreeSet<>();

        public int findMinDifference(List<String> timePoints) {
            for (String timePoint : timePoints) {
                String[] time = timePoint.split(":");
                int minute = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
                if (!minutes.contains(minute)) {
                    minutes.add(minute);
                    minutes.add(minute + 60 * 24);
                } else {
                    return 0;
                }
            }
            int[] times = new int[minutes.size()];
            int i = 0, min = 60 * 24 + 1;
            for (Integer minute : minutes) {
                times[i++] = minute;
            }
            for (int j = 1; j < times.length; j++) {
                min = Math.min(min, times[j] - times[j - 1]);
            }
            return min;
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0035().new Solution();
        //Object ans = s.findMinDifference(new ArrayList<>(List.of(new String[]{"00:00", "23:59", "00:00"})));
        //System.out.println(ans);
        Object ans = s.findMinDifference(new ArrayList<>(List.of(new String[]{"00:00", "23:59"})));
        System.out.println(ans);
    }
}