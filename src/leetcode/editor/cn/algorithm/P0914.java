package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-26 23:41
 * LastEditTime: 2022-07-26 23:41
 * Description: 914. 卡牌分组
 */

public class P0914 {
    // code beginning
    class Solution {
        public boolean hasGroupsSizeX(int[] deck) {
            int[] count = new int[10000];
            for (int c : deck) count[c]++;

            int gcd = -1;
            for (int i = 0; i < 10000; i++) {
                if (count[i] > 0) {
                    if (gcd == -1) {
                        gcd = count[i];
                    } else {
                        gcd = calcGCD(gcd, count[i]);
                    }
                }
            }
            return gcd >= 2;
        }

        private int calcGCD(int x, int y) {
            return x == 0 ? y : calcGCD(y % x, x);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0914().new Solution();
        Object ans = s.hasGroupsSizeX(new int[]{1, 1, 1, 2, 2, 2, 3, 3});
        System.out.println(ans);
        ans = s.hasGroupsSizeX(new int[]{1, 2, 3, 4, 4, 3, 2, 1});
        System.out.println(ans);
    }
}