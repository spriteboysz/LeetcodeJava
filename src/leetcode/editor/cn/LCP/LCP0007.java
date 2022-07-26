package leetcode.editor.cn.LCP;

import java.util.*;

/**
 * Author: Deean
 * Date: 2022-07-27 00:02
 * LastEditTime: 2022-07-27 00:02
 * Description: LCP 07. 传递信息
 */

public class LCP0007 {
    // code beginning
    class Solution {
        public int numWays(int n, int[][] relation, int k) {
            List<Set<Integer>> edges = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                edges.add(new HashSet<>());
            }
            for (int[] edge : relation) {
                int src = edge[0], dst = edge[1];
                edges.get(src).add(dst);
            }

            Queue<Integer> queue = new LinkedList<>();
            queue.offer(0);
            while (!queue.isEmpty() && k > 0) {
                k--;
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    int index = queue.poll();
                    Set<Integer> set = edges.get(index);
                    for (int next : set) {
                        queue.offer(next);
                    }
                }
            }

            int count = 0;
            while (!queue.isEmpty()) {
                if (queue.poll() == n - 1) count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCP0007().new Solution();
        Object ans = s.numWays(5, new int[][]{{0, 2}, {2, 1}, {3, 4}, {2, 3}, {1, 4}, {2, 0}, {0, 4}}, 3);
        System.out.println(ans);
    }
}