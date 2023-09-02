package leetcode.algorithm;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Author: Deean
 * Date: 2022-07-15 22:39
 * LastEditTime: 2022-07-15 22:39
 * Description: .
 */

public class P0232 {
    // code beginning
    class MyQueue {
        Deque<Integer> iStack, oStack;

        public MyQueue() {
            iStack = new ArrayDeque<>();
            oStack = new ArrayDeque<>();
        }

        public void push(int x) {
            iStack.push(x);
        }

        public int pop() {
            if (oStack.isEmpty()) {
                in2out();
            }
            return oStack.pop();
        }

        public int peek() {
            if (oStack.isEmpty()) {
                in2out();
            }
            return oStack.size() != 0 ? oStack.peek() : -1;
        }

        public boolean empty() {
            return iStack.isEmpty() && oStack.isEmpty();
        }

        private void in2out() {
            while (!iStack.isEmpty()) {
                oStack.push(iStack.pop());
            }
        }
    }

    public static void main(String[] args) {
        MyQueue myQueue = new P0232().new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println(myQueue.peek()); // return 1
        System.out.println(myQueue.pop()); // return 1, queue is [2]
        System.out.println(myQueue.empty()); // return false
    }
}