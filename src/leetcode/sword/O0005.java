package leetcode.sword;

/**
 * Author: Deean
 * Date: 2022-07-03 23:13
 * LastEditTime: 2022-07-03 23:13
 * Description: 剑指 Offer 05. 替换空格
 */

public class O0005 {
    // code beginning
    class Solution {
        public String replaceSpace(String s) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == ' ') {
                    sb.append("%20");
                } else {
                    sb.append(c);
                }
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new O0005().new Solution();
        Object ans = s.replaceSpace("We are happy.");
        System.out.println(ans);
    }
}