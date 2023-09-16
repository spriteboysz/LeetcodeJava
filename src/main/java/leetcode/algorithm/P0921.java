package leetcode.algorithm;

import java.util.Stack;

/**
 * Author: Deean
 * Date: 2023-09-15 22:21
 * FileName: src/main/java/leetcode/algorithm
 * Description:921. 使括号有效的最少添加
 */

public class P0921 {
    // code beginning
    class Solution {
        public int minAddToMakeValid(String s) {
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                if (stack.isEmpty()) {
                    stack.add(c);
                } else if (stack.peek() == '(' && c == ')') {
                    stack.pop();
                } else {
                    stack.add(c);
                }
            }
            return stack.size();
        }
    }

    public static void main(String[] args) {
        Solution s = new P0921().new Solution();
        var ans = s.minAddToMakeValid(")))");
        System.out.println(ans);
    }
}
