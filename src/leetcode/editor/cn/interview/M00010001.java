package leetcode.editor.cn.interview;

/**
 * Author: Deean
 * Date: 2022-07-07 23:27
 * LastEditTime: 2022-07-07 23:27
 * Description: 面试题 01.01. 判定字符是否唯一
 */

public class M00010001 {
    // code beginning
    class Solution {
        public boolean isUnique(String astr) {
            for (int i = 0; i < astr.length() - 1; i++) {
                for (int j = i + 1; j < astr.length(); j++) {
                    if (astr.charAt(i) == astr.charAt(j)) return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00010001().new Solution();
        Object ans = s.isUnique("leetcode");
        System.out.println(ans);
        ans = s.isUnique("abc");
        System.out.println(ans);
    }
}