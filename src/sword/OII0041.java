package sword;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: Deean
 * Date: 2022-07-04 23:28
 * LastEditTime: 2022-07-04 23:28
 * Description: 剑指 Offer II 041. 滑动窗口的平均值
 */

public class OII0041 {
    // code beginning
    class MovingAverage {
        private final int size;
        private final Queue<Integer> queue;
        private double sum;

        public MovingAverage(int size) {
            this.size = size;
            queue = new LinkedList<>();
            sum = 0;
        }

        public double next(int val) {
            if (queue.size() == size) {
                sum -= queue.remove();
            }
            queue.add(val);
            sum += val;
            return sum / queue.size();
        }
    }

    public static void main(String[] args) {
        MovingAverage movingAverage = new OII0041().new MovingAverage(3);
        System.out.println(movingAverage.next(1));
        System.out.println(movingAverage.next(10));
        System.out.println(movingAverage.next(3));
        System.out.println(movingAverage.next(5));
    }
}