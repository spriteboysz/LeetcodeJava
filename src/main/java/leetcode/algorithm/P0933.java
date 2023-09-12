package leetcode.algorithm;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Author: Deean
 * Date: 2022-07-04 23:35
 * LastEditTime: 2022-07-04 23:35
 * Description: 933. 最近的请求次数
 */

public class P0933 {
    // code beginning
    class RecentCounter {

        Queue<Integer> queue;

        public RecentCounter() {
            queue = new ArrayDeque<>();
        }

        public int ping(int t) {
            queue.offer(t);
            while (!queue.isEmpty() && queue.peek() < t - 3000) {
                queue.poll();
            }
            return queue.size();
        }
    }

    public static void main(String[] args) {
        RecentCounter recentCounter = new P0933().new RecentCounter();
        System.out.println(recentCounter.ping(1));
        System.out.println(recentCounter.ping(100));
        System.out.println(recentCounter.ping(3001));
        System.out.println(recentCounter.ping(3002));
    }
}