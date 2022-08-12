package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-12 22:42
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2073. 买票需要的时间
 */

public class P2073 {
    // code beginning
    class Solution {
        public int timeRequiredToBuy(int[] tickets, int k) {
            int time = 0;
            for (int i = 0; i < tickets.length; i++) {
                if (i <= k) {
                    time += Math.min(tickets[i], tickets[k]);
                } else {
                    time += tickets[i] >= tickets[k] ? tickets[k] - 1 : tickets[i];
                }
            }
            return time;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2073().new Solution();
        Object ans = s.timeRequiredToBuy(new int[]{5, 1, 1, 1}, 0);
        System.out.println(ans);
    }
}