package algorithm;

import java.util.PriorityQueue;

/**
 * Author: Deean
 * Date: 2022-07-31 00:00
 * LastEditTime: 2022-07-31 00:00
 * Description: 703. 数据流中的第 K 大元素
 */

public class P0703 {
    // code beginning
    class KthLargest {
        int k;
        PriorityQueue<Integer> queue;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            queue = new PriorityQueue<>();
            for (int num : nums) {
                queue.offer(num);
                if (queue.size() > k) queue.poll();
            }
        }

        public int add(int val) {
            queue.offer(val);
            if (queue.size() > k) queue.poll();
            return queue.size() == 0 ? -1 : queue.peek();
        }
    }

    public static void main(String[] args) {
        KthLargest kthLargest = new P0703().new KthLargest(3, new int[]{4, 5, 8, 2});
        kthLargest.add(3);   // return 4
        kthLargest.add(5);   // return 5
        kthLargest.add(10);  // return 5
        kthLargest.add(9);   // return 8
        kthLargest.add(4);   // return 8
    }
}