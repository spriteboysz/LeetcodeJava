package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-27 23:41
 * LastEditTime: 2022-07-27 23:41
 * Description: 2303. 计算应缴税款总额
 */

public class P2303 {
    // code beginning
    class Solution {
        public double calculateTax(int[][] brackets, int income) {
            double tax = 0.0;
            int prev = 0;
            for (int i = 0; i < brackets.length && income >= prev; i++) {
                tax += ((double) brackets[i][1] / 100) * (Math.min(brackets[i][0], income) - prev);
                prev = brackets[i][0];
            }
            return tax;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2303().new Solution();
        Object ans = s.calculateTax(new int[][]{{1, 0}, {4, 25}, {5, 50}}, 2);
        System.out.println(ans);
    }
}