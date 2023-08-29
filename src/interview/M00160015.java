package interview;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-12 23:27
 * LastEditTime: 2022-07-12 23:27
 * Description: 面试题 16.15. 珠玑妙算
 */

public class M00160015 {
    // code beginning
    class Solution {
        public int[] masterMind(String solution, String guess) {
            int hitted = 0, pseudo = 0;
            int[] s = new int[4], g = new int[4];
            for (int i = 0; i < solution.length(); i++) {
                if (solution.charAt(i) == guess.charAt(i)) {
                    hitted++;
                } else {
                    switch (solution.charAt(i)) {
                        case 'R' -> s[0]++;
                        case 'G' -> s[1]++;
                        case 'B' -> s[2]++;
                        case 'Y' -> s[3]++;
                    }
                    switch (guess.charAt(i)) {
                        case 'R' -> g[0]++;
                        case 'G' -> g[1]++;
                        case 'B' -> g[2]++;
                        case 'Y' -> g[3]++;
                    }
                }
            }
            for (int i = 0; i < solution.length(); i++) {
                pseudo += Math.min(s[i], g[i]);
            }
            return new int[]{hitted, pseudo};
        }
    }

    public static void main(String[] args) {
        Solution s = new M00160015().new Solution();
        int[] ans = s.masterMind("RGBY", "GGRR");
        System.out.println(Arrays.toString(ans));
    }
}