package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-09 23:44
 * LastEditTime: 2022-07-09 23:44
 * Description: 1716. 计算力扣银行的钱
 */

public class P1716 {
    // code beginning
    class Solution {
        public int totalMoney(int n) {
            int week = 1, day = 1, total = 0;
            for (int i = 0; i < n; i++) {
                total += week + day - 1;
                day++;
                if (day == 8) {
                    day = 1;
                    week++;
                }
            }
            return total;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1716().new Solution();
        Object ans = s.totalMoney(20);  // 96
        System.out.println(ans);
    }
}