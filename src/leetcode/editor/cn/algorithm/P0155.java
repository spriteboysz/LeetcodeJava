package leetcode.editor.cn.algorithm;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Author: Deean
 * Date: 2022-08-17 23:15
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 155. 最小栈
 */

public class P0155 {
    // code beginning
    class MinStack {
        Deque<Integer> stack;
        Deque<Integer> minStack;

        public MinStack() {
            stack = new LinkedList<>();
            minStack = new LinkedList<>();
            minStack.push(Integer.MAX_VALUE);
        }

        public void push(int val) {
            stack.push(val);
            minStack.push(Math.min(val, minStack.isEmpty() ? -1 : minStack.peek()));
        }

        public void pop() {
            stack.pop();
            minStack.pop();
        }

        public int top() {
            return stack.isEmpty() ? -1 : stack.peek();
        }

        public int getMin() {
            return minStack.isEmpty() ? -1 : minStack.peek();
        }
    }

    public static void main(String[] args) {
        MinStack minStack = new P0155().new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());   // 返回 -3.
        minStack.pop();
        System.out.println(minStack.top());      // 返回 0.
        System.out.println(minStack.getMin());   // 返回 -2.
    }
}