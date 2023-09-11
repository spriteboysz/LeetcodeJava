package leetcode.sword;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Author: Deean
 * Date: 2022-07-04 23:08
 * LastEditTime: 2022-07-04 23:08
 * Description: 剑指 Offer II 042. 最近请求次数
 */

public class OII0042 {
    // code beginning
    class RecentCounter {
        Queue<Integer> queue;

        public RecentCounter() {
            queue = new ArrayDeque<>();
        }

        public int ping(int t) {
            queue.offer(t);
            while (queue.size() > 0 && queue.peek() < t - 3000) {
                queue.poll();
            }
            return queue.size();
        }
    }

    public static void main(String[] args) {
        RecentCounter recentCounter = new OII0042().new RecentCounter();
        System.out.println(recentCounter.ping(1));
        System.out.println(recentCounter.ping(100));
        System.out.println(recentCounter.ping(3001));
        System.out.println(recentCounter.ping(3002));
    }
}