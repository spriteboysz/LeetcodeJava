package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-03 20:31
 * FileName: src/leetcode/algorithm
 * Description:2660. 保龄球游戏的获胜者
 */

public class P2660 {
    // code beginning
    class Solution {
        private int process(int[] player) {
            int score = 0, n = player.length;
            int[] flags = new int[n];
            for (int i = n - 1; i >= 0; i--) {
                flags[i] = 1;
                if (player[i] == 10) {
                    if (i + 1 < n) {
                        flags[i + 1] = 2;
                    }
                    if (i + 2 < n) {
                        flags[i + 2] = 2;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                score += player[i] * flags[i];
            }
            return score;
        }

        public int isWinner(int[] player1, int[] player2) {
            int score1 = process(player1), score2 = process(player2);
            if (score1 > score2) {
                return 1;
            } else if (score1 < score2) {
                return 2;
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P2660().new Solution();
        Object ans = s.isWinner(new int[]{4, 10, 7, 9}, new int[]{6, 5, 2, 3});
        System.out.println(ans);
    }
}
