package leetcode.algorithm;

/**
 * Author: @Deean
 * Date: 2022-06-23 23:32
 * LastEditTime: 2022-06-23 23:32
 * Description: 汉明距离
 */

public class P0461 {
    // code beginning
    class Solution {
        public int hammingDistance(int x, int y) {
            int hamming = 0;
            for (int i = 0; i < 32; i++) {
                hamming += ((x >> i) & 1) ^ ((y >> i) & 1);
            }
            return hamming;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0461().new Solution();
        Object ans = s.hammingDistance(1, 4);
        System.out.println(ans);
        ans = s.hammingDistance(3, 1);
        System.out.println(ans);
    }
}