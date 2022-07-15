package leetcode.editor.cn.sword;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Author: Deean
 * Date: 2022-07-15 21:27
 * LastEditTime: 2022-07-15 21:27
 * Description: 剑指 Offer 09. 用两个栈实现队列
 */

public class O0009 {
    // code beginning
    class CQueue {
        Deque<Integer> iStack, oStack;

        public CQueue() {
            iStack = new ArrayDeque<>();
            oStack = new ArrayDeque<>();
        }

        public void appendTail(int value) {
            iStack.push(value);
        }

        public int deleteHead() {
            if (oStack.isEmpty()) {
                if (iStack.isEmpty()) {
                    return -1;
                } else {
                    while (!iStack.isEmpty()) {
                        oStack.push(iStack.pop());
                    }
                }
            }
            return oStack.pop();
        }
    }

    public static void main(String[] args) {
        CQueue queue = new O0009().new CQueue();
        System.out.println(queue.deleteHead());
        queue.appendTail(5);
        queue.appendTail(2);
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
    }
}