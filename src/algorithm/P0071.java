package algorithm;

import java.util.Stack;

/**
 * Author: Deean
 * Date: 2022-08-20 21:28
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 71. 简化路径
 */

public class P0071 {
    // code beginning
    class Solution {
        public String simplifyPath(String path) {
            Stack<String> stack = new Stack<>();
            for (String item : path.split("/+")) {
                if (item.equals("") || item.equals(".")) continue;
                if (item.equals("..")) {
                    if (!stack.isEmpty()) stack.pop();
                } else {
                    stack.push(item);
                }
            }
            return stack.isEmpty() ? "/" : "/" + String.join("/", stack);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0071().new Solution();
        Object ans = s.simplifyPath("/a/./b/../../c/");
        System.out.println(ans);
    }
}