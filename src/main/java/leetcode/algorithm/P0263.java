package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-06-28 23:19
 * LastEditTime: 2022-06-28 23:19
 * Description: 0263 丑数
 */

public class P0263 {
    // code beginning
    class Solution {
        public boolean isUgly(int n) {
            if (n <= 0) return false;
            for (int i : new int[]{2, 3, 5}) {
                while (n % i == 0) {
                    n /= i;
                }
            }
            return n == 1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0263().new Solution();
        Object ans = s.isUgly(6);
        System.out.println(ans);
        ans = s.isUgly(14);
        System.out.println(ans);
    }
}