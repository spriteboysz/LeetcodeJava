package leetcode.editor.cn.algorithm;

import java.util.Stack;

/**
 * Author: Deean
 * Date: 2022-07-27 23:24
 * LastEditTime: 2022-07-27 23:24
 * Description: 1003. 检查替换后的词是否有效
 */

public class P1003 {
    // code beginning
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                if (c == 'c') {
                    if (stack.isEmpty() || 'b' != stack.pop()) return false;
                    if (stack.isEmpty() || 'a' != stack.pop()) return false;
                } else {
                    stack.push(c);
                }
            }
            return stack.isEmpty();
        }
    }

    public static void main(String[] args) {
        Solution s = new P1003().new Solution();
        Object ans = s.isValid("abcabcababcc");
        System.out.println(ans);
    }
}