package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-10 22:15
 * LastEditTime: 2022-07-10 22:15
 * Description: 1491. 去掉最低工资和最高工资后的工资平均值
 */

public class P1491 {
    // code beginning
    class Solution {
        public double average(int[] salary) {
            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0;
            for (int s : salary) {
                max = Math.max(max, s);
                min = Math.min(min, s);
                sum += s;
            }
            return (0.0d + (sum - max - min)) / (salary.length - 2);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1491().new Solution();
        Object ans = s.average(new int[]{8000, 9000, 2000, 3000, 6000, 1000});
        System.out.println(ans);
    }
}