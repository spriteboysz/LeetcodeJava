package leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Author: Deean
 * Date: 2023-09-14 23:29
 * FileName: src/main/java/leetcode/algorithm
 * Description:1249. 移除无效的括号
 */

public class P1249 {
    // code beginning
    class Solution {
        public String minRemoveToMakeValid(String s) {
            Set<Integer> indexesToRemove = new HashSet<>();
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    stack.push(i);
                }
                if (s.charAt(i) == ')') {
                    if (stack.isEmpty()) {
                        indexesToRemove.add(i);
                    } else {
                        stack.pop();
                    }
                }
            }

            while (!stack.isEmpty()) {
                indexesToRemove.add(stack.pop());
            }
            StringBuilder ss = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (!indexesToRemove.contains(i)) {
                    ss.append(s.charAt(i));
                }
            }
            return ss.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P1249().new Solution();
        var ans = s.minRemoveToMakeValid("lee(t(c)o)de)");
        System.out.println(ans);
    }
}
