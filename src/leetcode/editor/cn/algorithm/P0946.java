package leetcode.editor.cn.algorithm;

import java.util.Stack;

/**
 * Author: Deean
 * Date: 2022-07-30 23:19
 * LastEditTime: 2022-07-30 23:19
 * Description: 946. 验证栈序列
 */

public class P0946 {
    // code beginning
    class Solution {
        public boolean validateStackSequences(int[] pushed, int[] popped) {
            Stack<Integer> stack = new Stack<>();
            int index = 0;
            for (int num : pushed) {
                stack.push(num);
                while (!stack.isEmpty() && stack.peek() == popped[index]) {
                    stack.pop();
                    index++;
                }
            }
            return index >= popped.length;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0946().new Solution();
        Object ans = s.validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1});
        System.out.println(ans);
    }
}