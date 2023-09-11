package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-08-29 19:18
 * FileName: src/leetcode.algorithm
 * Description:2798. 满足目标工作时长的员工数目
 */

public class P2798 {
    // code beginning
    class Solution {
        public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
            int cnt = 0;
            for (int hour : hours) {
                if (hour >= target) {
                    cnt++;
                }
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2798().new Solution();
        Object ans = s.numberOfEmployeesWhoMetTarget(new int[]{0, 1, 2, 3, 4}, 2);
        System.out.println(ans);
    }
}
