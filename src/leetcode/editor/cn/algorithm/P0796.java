package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-13 23:40
 * LastEditTime: 2022-07-13 23:40
 * Description: 796. 旋转字符串
 */

public class P0796 {
    // code beginning
    class Solution {
        public boolean rotateString(String s, String goal) {
            if (s.length() != goal.length()) return false;
            for (int i = 0; i < s.length(); i++) {
                if (goal.equals(s.substring(i) + s.substring(0, i))) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0796().new Solution();
        Object ans = s.rotateString("abcde", "abced");
        System.out.println(ans);
        ans = s.rotateString("abcde", "deabc");
        System.out.println(ans);
    }
}