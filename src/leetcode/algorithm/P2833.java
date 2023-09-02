package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-08-29 13:49
 * FileName: src/leetcode.algorithm
 * Description: 2833. 距离原点最远的点
 */

public class P2833 {
    // code beginning
    class Solution {
        public int furthestDistanceFromOrigin(String moves) {
            int distance1 = 0, distance2 = 0, distance3 = 0;
            for (Character c : moves.toCharArray()) {
                if (c == 'L') {
                    distance1++;
                } else if (c == 'R') {
                    distance2++;
                } else {
                    distance3++;
                }
            }
            return Math.abs(distance1 - distance2) + distance3;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2833().new Solution();
        Object ans = s.furthestDistanceFromOrigin("L_RL__R");
        System.out.println(ans);
    }
}
