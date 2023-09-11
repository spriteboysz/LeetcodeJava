package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-06 16:15
 * Description: 1137. 第 N 个泰波那契数
 */

public class P1137 {
    // code beginning
    class Solution {
        public int tribonacci(int n) {
            if (n == 0) return 0;
            if (n <= 2) return 1;
            int p, a = 0, b = 1, c = 1;
            for (int i = 3; i <= n; i++) {
                p = a;
                a = b;
                b = c;
                c = p + a + b;
            }
            return c;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1137().new Solution();
        Object ans = s.tribonacci(25);
        System.out.println(ans);
    }
}