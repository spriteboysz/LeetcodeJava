package algorithm;

import java.util.Stack;

/**
 * Author: Deean
 * Date: 2022-07-17 22:09
 * LastEditTime: 2022-07-17 22:09
 * Description: 1047. 删除字符串中的所有相邻重复项
 */

public class P1047 {
    // code beginning
    class Solution {
        public String removeDuplicates(String s) {
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                if (!stack.isEmpty() && stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
            StringBuilder builder = new StringBuilder();
            for (char c : stack) {
                builder.append(c);
            }
            return builder.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P1047().new Solution();
        Object ans = s.removeDuplicates("abbaca");
        System.out.println(ans);
    }
}