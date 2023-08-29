package algorithm;

import java.util.Stack;

/**
 * Author: Deean
 * Date: 2022-08-12 00:01
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1544. 整理字符串
 */

public class P1544 {
    // code beginning
    class Solution {
        public String makeGood(String s) {
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                if (!stack.isEmpty() && Math.abs(stack.peek() - c) == ('a' - 'A')) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
            StringBuilder builder = new StringBuilder();
            for (char c : stack) builder.append(c);
            return builder.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P1544().new Solution();
        Object ans = s.makeGood("abBAcC");
        System.out.println(ans);
    }
}