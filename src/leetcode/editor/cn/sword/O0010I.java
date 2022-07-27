package leetcode.editor.cn.sword;

/**
 * Author: Deean
 * Date: 2022-07-27 23:52
 * LastEditTime: 2022-07-27 23:52
 * Description: 剑指 Offer 10- I. 斐波那契数列
 */

public class O0010I {
    // code beginning
    class Solution {
        public int fib(int n) {
            if (n < 2) return n;
            int a = 0, b = 1;
            for (int i = 2; i <= n; i++) {
                int temp = a;
                a = b;
                b = (temp + a) % 1000000007;
            }
            return b;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0010I().new Solution();
        Object ans = s.fib(5);
        System.out.println(ans);
    }
}