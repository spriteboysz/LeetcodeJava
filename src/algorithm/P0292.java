package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-29 23:01
 * LastEditTime: 2022-07-29 23:01
 * Description: 292. Nim 游戏
 */

public class P0292 {
    // code beginning
    class Solution {
        public boolean canWinNim(int n) {
            return n % 4 != 0;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0292().new Solution();
        Object ans = s.canWinNim(4);
        System.out.println(ans);
        ans = s.canWinNim(5);
        System.out.println(ans);
    }
}