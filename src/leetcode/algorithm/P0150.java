package leetcode.algorithm;

import java.util.Stack;

/**
 * Author: Deean
 * Date: 2022-07-30 23:07
 * LastEditTime: 2022-07-30 23:07
 * Description: 150. 逆波兰表达式求值
 */

public class P0150 {
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
        Solution s = new P0150().new Solution();
        Object ans = s.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"});
        System.out.println(ans);
    }
}