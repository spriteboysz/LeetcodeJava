package leetcode.editor.cn.algorithm;

import java.util.PriorityQueue;

/**
 * Author: Deean
 * Date: 2022-08-16 23:34
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1005. K 次取反后最大化的数组和
 */

public class P1005 {
    // code beginning
    class Solution {
        public int largestSumAfterKNegations(int[] nums, int k) {
            PriorityQueue<Integer> heap = new PriorityQueue<>();
            for (int num : nums) heap.offer(num);
            while (k > 0) {
                int num = heap.isEmpty() ? -1 : heap.poll();
                if (num < 0) {
                    heap.offer(-num);
                    k--;
                } else {
                    if (k % 2 == 0) heap.offer(num);
                    if (k % 2 != 0) heap.offer(-num);
                    break;
                }
            }
            int sum = 0;
            while (!heap.isEmpty()) sum += heap.poll();
            return sum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1005().new Solution();
        Object ans = s.largestSumAfterKNegations(new int[]{3, -1, 0, 2}, 3);
        System.out.println(ans);
        ans = s.largestSumAfterKNegations(new int[]{2, -3, -1, 5, -4}, 2);
        System.out.println(ans);
    }
}