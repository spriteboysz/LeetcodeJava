package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-16 22:18
 * LastEditTime: 2022-07-16 22:18
 * Description: 844. 比较含退格的字符串
 */

public class P0844 {
    // code beginning
    class Solution {
        public boolean backspaceCompare(String s, String t) {
            StringBuilder sBuilder = new StringBuilder(), tBuilder = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c == '#' && sBuilder.length() != 0) {
                    sBuilder.deleteCharAt(sBuilder.length() - 1);
                } else if (c != '#') {
                    sBuilder.append(c);
                }
            }
            for (char c : t.toCharArray()) {
                if (c == '#' && tBuilder.length() != 0) {
                    tBuilder.deleteCharAt(tBuilder.length() - 1);
                } else if (c != '#') {
                    tBuilder.append(c);
                }
            }
            return sBuilder.toString().contentEquals(tBuilder);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0844().new Solution();
        Object ans = s.backspaceCompare("ab##", "c#d#");
        System.out.println(ans);
        ans = s.backspaceCompare("y#fo##f", "y#f#o##f"); // true
        System.out.println(ans);
    }
}