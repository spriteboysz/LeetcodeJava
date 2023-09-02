package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-06-29 23:11
 * LastEditTime: 2022-06-29 23:11
 * Description: .
 */

public class P2160 {
    // code beginning
    class Solution {
        public int minimumSum(int num) {
            int[] number = new int[4];
            for (int i = 0; i < number.length; i++) {
                number[i] = num % 10;
                num /= 10;
            }
            // System.out.println(Arrays.toString(number));
            Arrays.sort(number);
            return (number[0] + number[1]) * 10 + number[2] + number[3];
        }
    }

    public static void main(String[] args) {
        Solution s = new P2160().new Solution();
        Object ans = s.minimumSum(4009);
        System.out.println(ans);
    }
}