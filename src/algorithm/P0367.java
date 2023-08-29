package algorithm;

/**
 * Author: Deean
 * Date: 2022-08-10 23:24
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 367. 有效的完全平方数
 */

public class P0367 {
    // code beginning
    class Solution {
        public boolean isPerfectSquare(int num) {
            int left = 0, right = num;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                long square = (long) mid * mid;
                if (square < num) {
                    left = mid + 1;
                } else if (square > num) {
                    right = mid - 1;
                } else {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0367().new Solution();
        Object ans = s.isPerfectSquare(625);
        System.out.println(ans);
        ans = s.isPerfectSquare(624);
        System.out.println(ans);
    }
}