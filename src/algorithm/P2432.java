package algorithm;

/**
 * Author: Deean
 * Date: 2023-02-26 17:29
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2432. 处理用时最长的那个任务的员工
 */

public class P2432 {
    // code beginning
    class Solution {
        public int hardestWorker(int n, int[][] logs) {
            int maxID = 0, maxTime = 0, last = 0;
            for (int[] log : logs) {
                if (log[0] > n) return -1;
                if (log[1] - last > maxTime) {
                    maxID = log[0];
                    maxTime = log[1] - last;
                } else if (log[1] - last == maxTime) {
                    maxID = Math.min(maxID, log[0]);
                }
                last = log[1];
            }
            return maxID;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2432().new Solution();
        Object ans = s.hardestWorker(10, new int[][]{{0, 3}, {2, 5}, {0, 9}, {1, 15}});
        System.out.println(ans);
    }
}
