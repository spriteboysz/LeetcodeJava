package sword;

import java.util.PriorityQueue;

/**
 * Author: Deean
 * Date: 2022-07-30 23:52
 * LastEditTime: 2022-07-30 23:52
 * Description: 剑指 Offer II 059. 数据流的第 K 大数值
 */

public class OII0059 {
    // code beginning
    class KthLargest {
        PriorityQueue<Integer> queue;
        int k;

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
        KthLargest kthLargest = new OII0059().new KthLargest(3, new int[]{4, 5, 8, 2});
        System.out.println(kthLargest.add(3));   // return 4
        System.out.println(kthLargest.add(5));   // return 5
        System.out.println(kthLargest.add(10));  // return 5
        System.out.println(kthLargest.add(9));   // return 8
        System.out.println(kthLargest.add(4));   // return 8
    }
}