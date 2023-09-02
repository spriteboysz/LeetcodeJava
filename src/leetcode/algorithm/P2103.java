package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-02 22:01
 * LastEditTime: 2022-07-02 22:01
 * Description: 2103. 环和杆
 */

public class P2103 {
    // code beginning
    class Solution {
        public int countPoints(String rings) {
            int[] rods = new int[10];
            for (int i = 0; i < rings.length(); i += 2) {
                char color = rings.charAt(i);
                int rod = rings.charAt(i + 1) - '0';
                if (color == 'B') rods[rod] |= 1;
                if (color == 'R') rods[rod] |= 2;
                if (color == 'G') rods[rod] |= 4;
            }

            int count = 0;
            for (int rod : rods) {
                if (rod == 7) count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2103().new Solution();
        Object ans = s.countPoints("B0R0G0R9R0B0G0");
        System.out.println(ans);
    }
}