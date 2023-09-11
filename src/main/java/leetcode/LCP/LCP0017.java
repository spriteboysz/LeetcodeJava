package leetcode.LCP;

/**
 * Author: Deean
 * Date: 2022-07-01 23:41
 * LastEditTime: 2022-07-01 23:41
 * Description: leetcode.LCP 17. 速算机器人
 */

public class LCP0017 {
    // code beginning
    class Solution {
        public int calculate(String s) {
            int x = 1, y = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == 'A') x = 2 * x + y;
                if (c == 'B') y = 2 * y + x;
            }
            return x + y;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCP0017().new Solution();
        Object ans = s.calculate("AB");
        System.out.println(ans);
    }
}