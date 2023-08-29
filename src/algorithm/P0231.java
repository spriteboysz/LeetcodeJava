package algorithm;

/**
 * Author: Deean
 * Date: 2022-06-26 21:52
 * LastEditTime: 2022-06-26 21:52
 * Description: 231. 2 的幂
 */

public class P0231 {
    // code beginning
    class Solution {
        public boolean isPowerOfTwo(int n) {
            return n > 0 && (n & n - 1) == 0;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0231().new Solution();
        Object ans = s.isPowerOfTwo(1024);
        System.out.println(ans);
    }
}