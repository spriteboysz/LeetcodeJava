package leetcode.algorithm;

import java.util.Stack;

/**
 * Author: Deean
 * Date: 2022-06-26 16:39
 * LastEditTime: 2022-06-26 16:39
 * Description: 20. 有效的括号
 */

public class P0020 {
    // code beginning
    class Solution {
        public boolean isValid(String s) {
            Stack<String> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                String c = String.valueOf(s.charAt(i));
                int n = stack.size() - 1;
                if (!stack.isEmpty() && stack.get(n).equals("(") && c.equals(")")) {
                    stack.pop();
                } else if (!stack.isEmpty() && stack.get(n).equals("[") && c.equals("]")) {
                    stack.pop();
                } else if (!stack.isEmpty() && stack.get(n).equals("{") && c.equals("}")) {
                    stack.pop();
                } else {
                    stack.add(c);
                }
            }
            return stack.size() == 0;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0020().new Solution();
        Object ans = s.isValid("([)]");
        System.out.println(ans);
    }
}