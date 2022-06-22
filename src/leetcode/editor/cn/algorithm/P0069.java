package leetcode.editor.cn.algorithm;

/**
 * Author: @Deean
 * Date: 2022-06-22 21:57
 * LastEditTime: 2022-06-22 21:57
 * Description: x 的平方根
 */

public class P0069 {
    // code beginning
    class Solution {
        public int mySqrt(int x) {
            if (x == 1 || x == 0) {
                return x;
            }
            int left = 1, right = x, ans = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if ((long) mid * mid <= x) {
                    ans = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0069().new Solution();
        int ans = s.mySqrt(100);
        System.out.println(ans);
        ans = s.mySqrt(2147395600);
        System.out.println(ans);
    }
}