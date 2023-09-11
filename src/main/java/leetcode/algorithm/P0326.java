package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-06-28 23:08
 * LastEditTime: 2022-06-28 23:08
 * Description: 326. 3 的幂
 */

public class P0326 {
    // code beginning
    class Solution {
        public boolean isPowerOfThree(int n) {
            while (n != 0 && n % 3 == 0) {
                n /= 3;
            }
            return n == 1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0326().new Solution();
        Object ans = s.isPowerOfThree(27);
        System.out.println(ans);
    }
}