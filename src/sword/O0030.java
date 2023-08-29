package sword;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Author: Deean
 * Date: 2022-08-17 23:45
 * FileName: src/leetcode/editor/cn/sword
 * Description: 剑指 Offer 30. 包含min函数的栈
 */

public class O0030 {
    // code beginning
    class MinStack {
        Deque<Integer> stack;
        Deque<Integer> minStack;

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            stack = new LinkedList<>();
            minStack = new LinkedList<>();
            minStack.push(Integer.MAX_VALUE);
        }

        public void push(int x) {
            stack.push(x);
            minStack.push(Math.min(x, minStack.isEmpty() ? -1 : minStack.peek()));
        }

        public void pop() {
            stack.pop();
            minStack.pop();
        }

        public int top() {
            return stack.isEmpty() ? -1 : stack.peek();
        }

        public int min() {
            return minStack.isEmpty() ? -1 : minStack.peek();
        }
    }

    public static void main(String[] args) {
        MinStack minStack = new O0030().new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.min());   // 返回 -3.
        minStack.pop();
        System.out.println(minStack.top());      // 返回 0.
        System.out.println(minStack.min());   // 返回 -2.
    }
}