package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-25 23:58
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 2379. 得到 K 个黑块的最少涂色次数
 */

public class P2379 {
    // code beginning
    class Solution {
        public int minimumRecolors(String blocks, int k) {
            int black = 0;
            for (int i = 0; i < k; i++) {
                if (blocks.charAt(i) == 'B') black++;
            }
            int count = k - black;
            for (int i = 1; i < blocks.length() - k + 1; i++) {
                if (blocks.charAt(i - 1) == 'B') black--;
                if (blocks.charAt(i + k - 1) == 'B') black++;
                count = Math.min(count, k - black);
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2379().new Solution();
        Object ans = s.minimumRecolors("WBBWWBBWBW", 7);
        System.out.println(ans);
    }
}