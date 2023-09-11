package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-02 23:00
 * LastEditTime: 2022-07-02 23:00
 * Description: 1812. 判断国际象棋棋盘中一个格子的颜色
 */

public class P1812 {
    // code beginning
    class Solution {
        public boolean squareIsWhite(String coordinates) {
            return (coordinates.charAt(0) - 'a' + coordinates.charAt(1) - '0') % 2 == 0;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1812().new Solution();
        Object ans = s.squareIsWhite("h3");
        System.out.println(ans);
    }
}