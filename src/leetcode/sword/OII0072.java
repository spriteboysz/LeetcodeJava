package leetcode.sword;

/**
 * Author: Deean
 * Date: 2022-07-31 23:22
 * LastEditTime: 2022-07-31 23:22
 * Description: 剑指 Offer II 072. 求平方根
 */

public class OII0072 {
    // code beginning
    class Solution {
        public int mySqrt(int x) {
            int left = 0, right = x, sqrt = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if ((long) mid * mid <= x) {
                    sqrt = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return sqrt;
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0072().new Solution();
        Object ans = s.mySqrt(4);
        System.out.println(ans);
        ans = s.mySqrt(8);
        System.out.println(ans);
    }
}