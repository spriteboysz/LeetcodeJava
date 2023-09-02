package leetcode.sword;

/**
 * Author: Deean
 * Date: 2022-08-25 23:47
 * FileName: src/leetcode/editor/cn/leetcode.sword
 * Description: 剑指 Offer 62. 圆圈中最后剩下的数字
 */

public class O0062 {
    // code beginning
    class Solution {
        public int lastRemaining(int n, int m) {
            if (n == 1) return 0;
            int x = lastRemaining(n - 1, m);
            return (m + x) % n;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0062().new Solution();
        Object ans = s.lastRemaining(10, 17);
        System.out.println(ans);
    }
}