package leetcode.editor.cn.sword;

/**
 * Author: Deean
 * Date: 2022-08-01 23:00
 * LastEditTime: 2022-08-01 23:00
 * Description: .
 */

public class O0010II {
    // code beginning
    class Solution {
        public int numWays(int n) {
            int a = 1, b = 1;
            for (int i = 1; i <= n; i++) {
                int temp = (a + b) % 1000000007;
                a = b;
                b = temp;
            }
            return a;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0010II().new Solution();
        Object ans = s.numWays(7);
        System.out.println(ans);
    }
}