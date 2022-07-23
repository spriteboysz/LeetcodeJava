package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-23 23:33
 * LastEditTime: 2022-07-23 23:33
 * Description: 1190. 反转每对括号间的子串
 */

public class P1190 {
    // code beginning
    class Solution {
        public String reverseParentheses(String s) {
            StringBuilder str = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c == ')') {
                    StringBuilder cur = new StringBuilder();
                    int index = str.lastIndexOf("(");
                    cur.append(str.substring(index + 1, str.length())).reverse();
                    str.delete(index, str.length()).append(cur);
                } else {
                    str.append(c);
                }
            }
            return str.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P1190().new Solution();
        Object ans = s.reverseParentheses("a(bcdefghijkl(mno)p)q");
        System.out.println(ans);
    }
}