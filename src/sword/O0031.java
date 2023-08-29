package sword;

import java.util.Stack;

/**
 * Author: Deean
 * Date: 2022-07-30 23:12
 * LastEditTime: 2022-07-30 23:12
 * Description: 剑指 Offer 31. 栈的压入、弹出序列
 */

public class O0031 {
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
        Solution s = new O0031().new Solution();
        Object ans = s.validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 3, 5, 1, 2});
        System.out.println(ans);
        ans = s.validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1});
        System.out.println(ans);
    }
}