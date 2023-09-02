package leetcode.algorithm;

/**
 * Author: @Deean
 * Date: 2022-06-24 21:34
 * LastEditTime: 2022-06-24 21:34
 * Description: 反转字符串 II
 */

public class P0541 {
    // code beginning
    class Solution {
        public String reverseStr(String s, int k) {
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < s.length(); ) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < k && i < s.length(); i++, j++) {
                    sb.append(s.charAt(i));
                }
                str.append(sb.reverse());
                for (int j = 0; j < k && i < s.length(); i++, j++) {
                    str.append(s.charAt(i));
                }
            }
            return str.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P0541().new Solution();
        Object ans = s.reverseStr("abcdefg", 2);
        System.out.println(ans);
    }
}