package algorithm;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: Deean
 * Date: 2022-06-28 00:01
 * LastEditTime: 2022-06-28 00:01
 * Description: .
 */

public class P0225 {
    // code beginning
    class MyStack {
        Queue<Integer> queue1;
        Queue<Integer> queue2;

        public MyStack() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
        }

        public void push(int x) {
            queue2.offer(x);
            while (!queue1.isEmpty()) {
                queue2.offer(queue1.poll());
            }
            Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;
        }

        public int pop() {
            return queue1.poll();
        }

        public int top() {
            return queue1.peek();
        }

        public boolean empty() {
            return queue1.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyStack myStack = new P0225().new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.top());
        System.out.println(myStack.pop());
        System.out.println(myStack.empty());
    }
}