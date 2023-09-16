package leetcode.algorithm;

import java.util.Stack;

/**
 * Author: Deean
 * Date: 2023-09-15 23:16
 * FileName: src/main/java/leetcode/algorithm
 * Description:856. 括号的分数
 */

public class P0856 {
    // code beginning
    class Solution {
        public int scoreOfParentheses(String s) {
            Stack<Integer> stack = new Stack<>();
            stack.add(0);
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    stack.push(0);
                } else {
                    int cur = stack.pop();
                    stack.push(stack.pop() + Math.max(cur * 2, 1));
                }
            }
            return stack.peek();
        }
    }

    public static void main(String[] args) {
        Solution s = new P0856().new Solution();
        var ans = s.scoreOfParentheses("(()(()))");
        System.out.println(ans);
    }
}
