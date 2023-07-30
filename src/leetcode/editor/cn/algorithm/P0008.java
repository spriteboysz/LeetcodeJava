package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-20 22:13
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 8. 字符串转换整数 (atoi)
 */

public class P0008 {
    // code beginning
    class Solution {
        public int myAtoi(String s) {
            s = s.trim().split(" ")[0];
            boolean positive = true;
            long num = 0L;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (i == 0 && c == '+') continue;
                if (i == 0 && c == '-') {
                    positive = false;
                } else if (Character.isDigit(c)) {
                    num = num * 10 + c - '0';
                    if (positive && num > Integer.MAX_VALUE) {
                        num = Integer.MAX_VALUE;
                        break;
                    }
                    if (!positive && num > 1L + Integer.MAX_VALUE) {
                        num = 1L + Integer.MAX_VALUE;
                        break;
                    }
                } else {
                    break;
                }
            }
            return positive ? (int) num : (int) -num;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0008().new Solution();
        int ans = s.myAtoi("   -42");
        System.out.println(ans);
        ans = s.myAtoi("4193 with words");
        System.out.println(ans);
    }
}