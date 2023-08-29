package algorithm;

/**
 * Author: Deean
 * Date: 2022-08-21 16:26
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1201. 丑数 III
 */

public class P1201 {
    // code beginning
    class Solution {
        public int nthUglyNumber(int n, int a, int b, int c) {
            long ans = 0;
            long left = 0, right = (long) Math.min(a, Math.min(b, c)) * n;
            long ab = this.lcm(a, b);
            long ac = this.lcm(a, c);
            long bc = this.lcm(b, c);
            long abc = this.lcm(b, ac);
            while (left <= right) {
                long mid = left + ((right - left) >> 1);
                long num = mid / a + mid / b + mid / c - mid / ab - mid / ac - mid / bc + mid / abc;
                if (num < n) {
                    left = mid + 1;
                    ans = left;
                } else {
                    right = mid - 1;
                }
            }
            return (int) ans;
        }

        private long gcd(long a, long b) {
            return b == 0 ? a : gcd(b, a % b);
        }

        private long lcm(long a, long b) {
            return a * b / gcd(a, b);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1201().new Solution();
        Object ans = s.nthUglyNumber(1000000000, 2, 217983653, 336916467);
        System.out.println(ans);
    }
}