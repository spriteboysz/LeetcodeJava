package leetcode.editor.cn.interview;

/**
 * Author: Deean
 * Date: 2022-07-29 23:03
 * LastEditTime: 2022-07-29 23:03
 * Description: 面试题 01.09. 字符串轮转
 */

public class M00010009 {
    // code beginning
    class Solution {
        public boolean isFlipedString(String s1, String s2) {
            if (s1.length() != s2.length()) return false;
            return (s2 + s2).contains(s1);
        }
    }

    public static void main(String[] args) {
        Solution s = new M00010009().new Solution();
        Object ans = s.isFlipedString("waterbottle", "erbottlewat");
        System.out.println(ans);
    }
}