package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-25 22:53
 * LastEditTime: 2022-07-25 22:53
 * Description: 1790. 仅执行一次字符串交换能否使两个字符串相等
 */

public class P1790 {
    // code beginning
    class Solution {
        public boolean areAlmostEqual(String s1, String s2) {
            if (s1.equals(s2)) return true;
            StringBuilder builder1 = new StringBuilder();
            StringBuilder builder2 = new StringBuilder();
            for (int i = 0; i < s1.length(); ++i) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    builder1.append(s1.charAt(i));
                    builder2.insert(0, s2.charAt(i));
                    if (builder1.length() > 2) {
                        return false;
                    }
                }
            }
            return (builder1.length() == 2) && (builder1.toString().equals(builder2.toString()));
        }
    }

    public static void main(String[] args) {
        Solution s = new P1790().new Solution();
        Object ans = s.areAlmostEqual("kelb", "kelb");
        System.out.println(ans);
        ans = s.areAlmostEqual("abcd", "dcba");
        System.out.println(ans);
    }
}