package leetcode.LCP;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: Deean
 * Date: 2023-09-30 21:17
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 125. 图书整理 II
 */

public class LCR0125 {
    // code beginning
    class CQueue {
        Queue<Integer> queue;

        public CQueue() {
            queue = new LinkedList<>();
        }

        public void appendTail(int value) {
            queue.offer(value);
        }

        public int deleteHead() {
            if (!queue.isEmpty()) {
                return queue.poll();
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        CQueue queue = new LCR0125().new CQueue();
        queue.appendTail(1);
        queue.appendTail(2);
        System.out.println(queue.deleteHead());
    }
}
