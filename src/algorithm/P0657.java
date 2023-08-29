package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-03 16:28
 * LastEditTime: 2022-07-03 16:28
 * Description: 657. 机器人能否返回原点
 */

public class P0657 {
    // code beginning
    class Solution {
        public boolean judgeCircle(String moves) {
            int horizontal = 0, vertical = 0;
            for (int i = 0; i < moves.length(); i++) {
                switch (moves.charAt(i)) {
                    case 'U' -> vertical++;
                    case 'D' -> vertical--;
                    case 'R' -> horizontal++;
                    case 'L' -> horizontal--;
                }
            }
            return horizontal == 0 && vertical == 0;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0657().new Solution();
        Object ans = s.judgeCircle("UDLR");
        System.out.println(ans);
    }
}