package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-10 16:45
 * FileName: src/leetcode/algorithm
 * Description:1922. 统计好数字的数目
 */

public class P1922 {
    // code beginning
    class Solution {
        int MOD = (int) 1e9 + 7;

        private long process(long basic, long n) {
            if (n == 0) return 1;
            long b = process(basic, n >> 1) % MOD;
            long bb = b * b % MOD;
            return (n & 1) == 0 ? bb : bb * basic % MOD;
        }

        public int countGoodNumbers(long n) {
            long n1 = n >> 1;
            long n2 = n1;
            if ((n & 1) == 1) n2++;
            return (int) ((process(4, n1) * process(5, n2)) % MOD);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1922().new Solution();
        var ans = s.countGoodNumbers(50);
        System.out.println(ans);
    }
}
