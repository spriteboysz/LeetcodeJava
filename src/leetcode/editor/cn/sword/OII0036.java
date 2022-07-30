package leetcode.editor.cn.sword;

import java.util.Stack;

/**
 * Author: Deean
 * Date: 2022-07-30 22:54
 * LastEditTime: 2022-07-30 22:54
 * Description: 剑指 Offer II 036. 后缀表达式
 */

public class OII0036 {
    // code beginning
    class Solution {
        public int evalRPN(String[] tokens) {
            Stack<Integer> stack = new Stack<>();
            for (String token : tokens) {
                switch (token) {
                    case "+" -> {
                        int a = stack.pop(), b = stack.pop();
                        stack.push(b + a);
                    }
                    case "-" -> {
                        int a = stack.pop(), b = stack.pop();
                        stack.push(b - a);
                    }
                    case "*" -> {
                        int a = stack.pop(), b = stack.pop();
                        stack.push(b * a);
                    }
                    case "/" -> {
                        int a = stack.pop(), b = stack.pop();
                        stack.push(b / a);
                    }
                    default -> stack.push(Integer.parseInt(token));
                }
            }
            return stack.pop();
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0036().new Solution();
        Object ans = s.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"});
        System.out.println(ans);
    }
}