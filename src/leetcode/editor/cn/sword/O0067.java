package leetcode.editor.cn.sword;

/**
 * Author: Deean
 * Date: 2022-07-31 23:45
 * LastEditTime: 2022-07-31 23:45
 * Description: 剑指 Offer 67. 把字符串转换成整数
 */

public class O0067 {
    // code beginning
    class Solution {
        public int strToInt(String str) {
            char[] cs = str.trim().toCharArray();
            if (cs.length <= 0) return 0;
            boolean flag = (cs[0] == '-');
            long ans = 0;
            for (int i = cs[0] == '-' || cs[0] == '+' ? 1 : 0; i < cs.length; i++) {
                if (!Character.isDigit(cs[i])) break;
                if (flag) {
                    ans = ans * 10 - cs[i] + '0';
                } else {
                    ans = ans * 10 + cs[i] - '0';
                }
                if (ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if (ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }
            return (int) ans;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0067().new Solution();
        Object ans = s.strToInt("42");
        System.out.println(ans);
        ans = s.strToInt("     -42");
        System.out.println(ans);
        ans = s.strToInt("4193 with words");
        System.out.println(ans);
        ans = s.strToInt("words and 987");
        System.out.println(ans);
        ans = s.strToInt("-91283472332");
        System.out.println(ans);
    }
}