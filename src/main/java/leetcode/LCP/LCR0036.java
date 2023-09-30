package leetcode.LCP;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Author: Deean
 * Date: 2023-09-29 16:29
 * FileName: src/main/java/leetcode/algorithm
 * Description:LCR 036. 逆波兰表达式求值
 */

public class LCR0036 {
    // code beginning
    class Solution {
        public int evalRPN(String[] tokens) {
            Deque<Integer> stack = new LinkedList<>();
            for (String token : tokens) {
                if (token.length() > 1 || Character.isDigit(token.charAt(0))) {
                    stack.push(Integer.parseInt(token));
                } else {
                    int num2 = stack.pop(), num1 = stack.pop();
                    switch (token) {
                        case "+":
                            stack.push(num1 + num2);
                            break;
                        case "-":
                            stack.push(num1 - num2);
                            break;
                        case "*":
                            stack.push(num1 * num2);
                            break;
                        case "/":
                            stack.push(num1 / num2);
                            break;
                        default:
                    }
                }
            }
            return stack.pop();
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0036().new Solution();
        var ans = s.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"});
        System.out.println(ans);
    }
}
