package leetcode.editor.cn.algorithm;


import java.util.PriorityQueue;

/**
 * Author: Deean
 * Date: 2022-08-05 21:53
 * Description: 1046. 最后一块石头的重量
 */

public class P1046 {
    // code beginning
    class Solution {
        public int lastStoneWeight(int[] stones) {
            PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
            for (int stone : stones) {
                queue.add(stone);
            }
            while (queue.size() > 1) {
                int x = queue.poll();
                int y = queue.isEmpty() ? 0 : queue.poll();
                if (x != y) queue.offer(Math.abs(x - y));
            }
            return queue.isEmpty() ? 0 : queue.peek();
        }
    }

    public static void main(String[] args) {
        Solution s = new P1046().new Solution();
        Object ans = s.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1});
        System.out.println(ans);
    }
}