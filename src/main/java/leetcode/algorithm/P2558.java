package leetcode.algorithm;

import java.util.PriorityQueue;

/**
 * Author: Deean
 * Date: 2023-02-26 10:48
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 2558. 从数量最多的堆取走礼物
 */

public class P2558 {
    // code beginning
    class Solution {
        public long pickGifts(int[] gifts, int k) {
            PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
            for (int gift : gifts) {
                queue.offer(gift);
            }
            for (int i = 0; i < k; i++) {
                int temp = queue.poll();
                temp = (int) Math.sqrt(temp);
                queue.offer(temp);
            }
            long sum = 0;
            for (int num : queue) {
                sum += num;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2558().new Solution();
        Object ans = s.pickGifts(new int[]{25, 64, 9, 4, 100}, 4);
        System.out.println(ans);
    }
}
