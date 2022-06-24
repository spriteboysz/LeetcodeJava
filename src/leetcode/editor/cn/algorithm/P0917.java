package leetcode.editor.cn.algorithm;

/**
 * Author: @Deean
 * Date: 2022-06-24 21:53
 * LastEditTime: 2022-06-24 21:53
 * Description: 917. 仅仅反转字母
 */

public class P0917 {
    // code beginning
    class Solution {
        public String reverseOnlyLetters(String s) {
            StringBuilder chars = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isLetter(c)) chars.append(c);
            }
            String reverse = chars.reverse().toString();
            StringBuilder str = new StringBuilder();
            for (int i = 0, j = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isLetter(c)) {
                    str.append(reverse.charAt(j++));
                } else {
                    str.append(c);
                }
            }
            return str.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P0917().new Solution();
        Object ans = s.reverseOnlyLetters("a-bC-dEf-ghIj");
        System.out.println(ans);
    }
}