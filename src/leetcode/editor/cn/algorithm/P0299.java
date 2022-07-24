package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-24 23:03
 * LastEditTime: 2022-07-24 23:03
 * Description: 299. 猜数字游戏
 */

public class P0299 {
    // code beginning
    class Solution {
        public String getHint(String secret, String guess) {
            int bulls = 0, cows = 0;
            int[] sNumber = new int[10], gNumber = new int[10];
            for (int i = 0; i < secret.length(); i++) {
                char s = secret.charAt(i), g = guess.charAt(i);
                if (s == g) {
                    bulls++;
                } else {
                    sNumber[s - '0']++;
                    gNumber[g - '0']++;
                }
            }
            for (int i = 0; i <= 9; i++) {
                cows += Math.min(sNumber[i], gNumber[i]);
            }
            return String.format("%dA%dB", bulls, cows);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0299().new Solution();
        Object ans = s.getHint("1123", "0111");
        System.out.println(ans);
    }
}