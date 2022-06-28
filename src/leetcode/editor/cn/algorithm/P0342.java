package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-06-28 23:14
 * LastEditTime: 2022-06-28 23:14
 * Description: 342. 4的幂
 */

public class P0342 {
    // code beginning
    class Solution {
        public boolean isPowerOfFour(int n) {
            while (n != 0 && n % 4 == 0) {
                n >>= 2;
            }
            return n == 1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0342().new Solution();
        Object ans = s.isPowerOfFour(16);
        System.out.println(ans);
    }
}