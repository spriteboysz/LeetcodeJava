package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-20 21:36
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 1033. 移动石子直到连续
 */

public class P1033 {
    // code beginning
    class Solution {
        public int[] numMovesStones(int a, int b, int c) {
            int[] stones = new int[]{a, b, c};
            Arrays.sort(stones);
            a = stones[0];
            b = stones[1];
            c = stones[2];
            int min = 2;
            if (b - a == 1 && c - b == 1) {
                min = 0;
            } else if (b - a == 1 || b - a == 2 || c - b == 1 || c - b == 2) {
                min = 1;
            }
            return new int[]{min, c - a - 2};
        }
    }

    public static void main(String[] args) {
        Solution s = new P1033().new Solution();
        Object ans = s.numMovesStones(1, 2, 5);
        System.out.println(ans);
        ans = s.numMovesStones(4, 3, 2);
        System.out.println(ans);
    }
}