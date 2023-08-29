package LCP;

/**
 * Author: Deean
 * Date: 2022-07-01 21:09
 * LastEditTime: 2022-07-01 21:09
 * Description: LCP 01. 猜数字
 */

public class LCP0001 {
    // code beginning
    class Solution {
        public int game(int[] guess, int[] answer) {
            int count = 0;
            for (int i = 0; i < guess.length; i++) {
                if (guess[i] == answer[i]) count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCP0001().new Solution();
        Object ans = s.game(new int[]{2, 2, 3}, new int[]{3, 2, 1});
        System.out.println(ans);
    }
}