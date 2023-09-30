package leetcode.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-29 15:49
 * FileName: src/main/java/leetcode/algorithm
 * Description:LCR 035. 最小时间差
 */

public class LCR0035 {
    // code beginning
    class Solution {
        public int process(String t) {
            return ((t.charAt(0) - '0') * 10 + (t.charAt(1) - '0')) * 60 + (t.charAt(3) - '0') * 10 + (t.charAt(4) - '0');
        }

        public int findMinDifference(List<String> timePoints) {
            if (timePoints.size() > 1440) return 0;
            Collections.sort(timePoints);
            int minimum = Integer.MAX_VALUE;
            int t0 = process(timePoints.get(0));
            int pref = t0;
            for (int i = 1; i < timePoints.size(); ++i) {
                int cur = process(timePoints.get(i));
                minimum = Math.min(minimum, cur - pref);
                pref = cur;
            }
            return Math.min(minimum, t0 + 1440 - pref);
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0035().new Solution();
        List<String> timePoints = new ArrayList<>();
        timePoints.add("00:00");
        timePoints.add("23:59");
        timePoints.add("00:00");
        var ans = s.findMinDifference(timePoints);
        System.out.println(ans);
    }
}
