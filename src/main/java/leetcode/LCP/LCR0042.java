package leetcode.LCP;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Author: Deean
 * Date: 2023-09-29 18:00
 * FileName: src/main/java/leetcode/algorithm
 * Description:LCR 042. 最近的请求次数
 */

public class LCR0042 {
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
        RecentCounter s = new LCR0042().new RecentCounter();
        System.out.println(s.ping(1));
        System.out.println(s.ping(100));
        System.out.println(s.ping(3001));
        System.out.println(s.ping(3002));
    }
}
