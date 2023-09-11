package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-03 18:24
 * FileName: src/leetcode/algorithm
 * Description:2682. 找出转圈游戏输家
 */

public class P2682 {
    // code beginning
    class Solution {
        public int[] circularGameLosers(int n, int k) {
            boolean[] visited = new boolean[n];
            int cnt = 0;
            for (int i = 0, pos = 1; !visited[i]; pos++) {
                visited[i] = true;
                cnt++;
                i = (i + pos * k) % n;
            }
            int[] losers = new int[n - cnt];
            for (int i = 0, j = 0; i < n; i++) {
                if (!visited[i]) {
                    losers[j] = i + 1;
                    j++;
                }
            }
            return losers;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2682().new Solution();
        Object ans = s.circularGameLosers(5, 2);
        System.out.println(Arrays.toString((int[]) ans));
    }
}
