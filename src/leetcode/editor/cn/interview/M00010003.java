package leetcode.editor.cn.interview;

/**
 * Author: Deean
 * Date: 2022-07-29 23:14
 * LastEditTime: 2022-07-29 23:14
 * Description: 面试题 01.03. URL化
 */

public class M00010003 {
    // code beginning
    class Solution {
        public String replaceSpaces(String s, int length) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < s.length() && i < length; i++) {
                char c = s.charAt(i);
                if (c == ' ') {
                    builder.append("%20");
                } else {
                    builder.append(c);
                }
            }
            return builder.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new M00010003().new Solution();
        Object ans = s.replaceSpaces("Mr John Smith    ", 13);
        System.out.println(ans);
        ans = s.replaceSpaces("               ", 5);
        System.out.println(ans);
    }
}