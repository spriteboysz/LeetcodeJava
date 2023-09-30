package leetcode.LCP;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Author: Deean
 * Date: 2023-09-29 17:40
 * FileName: src/main/java/leetcode/algorithm
 * Description:LCR 041. 数据流中的移动平均值
 */

public class LCR0041 {
    // code beginning
    class MovingAverage {

        Queue<Integer> queue;
        int size;
        int sum;


        /**
         * Initialize your data structure here.
         */
        public MovingAverage(int size) {
            queue = new ArrayDeque<>();
            this.size = size;
            sum = 0;
        }

        public double next(int val) {
            if (queue.size() == size) {
                if (!queue.isEmpty()) {
                    sum -= queue.poll();
                }
            }
            queue.offer(val);
            sum += val;
            return sum * 1.0 / queue.size();
        }
    }

    public static void main(String[] args) {
        MovingAverage s = new LCR0041().new MovingAverage(3);
        System.out.println(s.next(1));
        System.out.println(s.next(10));
        System.out.println(s.next(3));
        System.out.println(s.next(5));
    }
}
