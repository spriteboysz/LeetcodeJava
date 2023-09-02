package leetcode.interview;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Author: Deean
 * Date: 2022-07-14 23:44
 * LastEditTime: 2022-07-14 23:44
 * Description: 面试题 03.04. 化栈为队
 */

public class M00030004 {
    // code beginning
    class MyQueue {
        Deque<Integer> iStack, oStack;

        /**
         * Initialize your data structure here.
         */
        public MyQueue() {
            iStack = new ArrayDeque<>();
            oStack = new ArrayDeque<>();
        }

        /**
         * Push element x to the back of queue.
         */
        public void push(int x) {
            iStack.push(x);
        }

        /**
         * Removes the element from in front of queue and returns that element.
         */
        public int pop() {
            if (oStack.isEmpty()) {
                transfer();
            }
            return oStack.pop();
        }

        /**
         * Get the front element.
         */
        public int peek() {
            if (oStack.isEmpty()) {
                transfer();
            }
            return oStack.peek();
        }

        /**
         * Returns whether the queue is empty.
         */
        public boolean empty() {
            return iStack.isEmpty() && oStack.isEmpty();
        }

        private void transfer() {
            while (!iStack.isEmpty()) {
                oStack.push(iStack.pop());
            }
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new M00030004().new MyQueue();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());  // 返回 1
        System.out.println(queue.pop());   // 返回 1
        System.out.println(queue.empty()); // 返回 false
    }
}