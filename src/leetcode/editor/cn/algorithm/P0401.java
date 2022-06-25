package leetcode.editor.cn.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-06-25 23:04
 * LastEditTime: 2022-06-25 23:04
 * Description: 401. 二进制手表
 */

public class P0401 {
    // code beginning
    class Solution {
        public List<String> readBinaryWatch(int turnedOn) {
            ArrayList<String> times = new ArrayList<>();
            for (int minutes = 0; minutes < 12 * 60; minutes++) {
                int count = 0;
                int hour = minutes / 60, minute = minutes % 60;
                for (int i = 0; i < 6; i++) {
                    count += ((hour >> i) & 1) + ((minute >> i) & 1);
                }
                // System.out.println(hour + ":" + minute + "," + count);
                if (count == turnedOn) {
                    times.add(hour + ":" + String.format("%02d", minute));
                }
            }
            return times;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0401().new Solution();
        Object ans = s.readBinaryWatch(5);
        System.out.println(ans);
    }
}