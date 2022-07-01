package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-01 23:26
 * LastEditTime: 2022-07-01 23:26
 * Description: 1450. 在既定时间做作业的学生人数
 */

public class P1450 {
    // code beginning
    class Solution {
        public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
            int count = 0;
            for (int i = 0; i < startTime.length; i++) {
                if (startTime[i] <= queryTime && endTime[i] >= queryTime) count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1450().new Solution();
        Object ans = s.busyStudent(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10}, 5);
        System.out.println(ans);
    }
}