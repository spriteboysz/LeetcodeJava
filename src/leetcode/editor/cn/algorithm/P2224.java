package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-16 23:18
 * LastEditTime: 2022-07-16 23:18
 * Description: 2224. 转化时间需要的最少操作数
 */

public class P2224 {
    // code beginning
    class Solution {
        public int convertTime(String current, String correct) {
            String[] time1 = current.split(":"), time2 = correct.split(":");
            int times1 = Integer.parseInt(time1[0]) * 60 + Integer.parseInt(time1[1]);
            int times2 = Integer.parseInt(time2[0]) * 60 + Integer.parseInt(time2[1]);
            int diff = times2 - times1, count = 0;
            for (int c : new int[]{60, 15, 5, 1}) {
                count += diff / c;
                diff = diff % c;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2224().new Solution();
        Object ans = s.convertTime("11:00", "11:01");
        System.out.println(ans);
    }
}