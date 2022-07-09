package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-09 23:38
 * LastEditTime: 2022-07-09 23:38
 * Description: 2124. 检查是否所有 A 都在 B 之前
 */

public class P2124 {
    // code beginning
    class Solution {
        public boolean checkString(String s) {
            if (!s.contains("a")) {
                return true;
            } else {
                return !s.contains("ba");
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P2124().new Solution();
        Object ans = s.checkString("abab");
        System.out.println(ans);
        ans = s.checkString("bbb");
        System.out.println(ans);
    }
}