package interview;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Author: Deean
 * Date: 2022-08-17 23:02
 * FileName: src/leetcode/editor/cn/interview
 * Description: 面试题 03.02. 栈的最小值
 */

public class M00030002 {
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
            minStack.push(Math.min(x, !minStack.isEmpty() ? minStack.peek() : -1));
        }

        public void pop() {
            stack.pop();
            minStack.pop();
        }

        public int top() {
            return !stack.isEmpty() ? stack.peek() : -1;
        }

        public int getMin() {
            return !minStack.isEmpty() ? minStack.peek() : -1;
        }
    }

    public static void main(String[] args) {
        MinStack minStack = new M00030002().new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());   // -3
        minStack.pop();
        System.out.println(minStack.top());      // 0
        System.out.println(minStack.getMin());  // -2
    }
}