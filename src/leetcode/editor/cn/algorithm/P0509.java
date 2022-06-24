package leetcode.editor.cn.algorithm;

/**
 * Author: @Deean
 * Date: 2022-06-24 23:31
 * LastEditTime: 2022-06-24 23:31
 * Description: 509. 斐波那契数
 */

public class P0509 {
    // code beginning
    class Solution {
        public int fib(int n) {
            if (n <= 1) return n;
            int a = 0, b = 0, c = 1;
            for (int i = 2; i <= n; i++) {
                a = b;
                b = c;
                c = a + b;
            }
            return c;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0509().new Solution();
        Object ans = s.fib(4);
        System.out.println(ans);
    }
}