package leetcode.algorithm;

import java.util.TreeSet;

/**
 * Author: Deean
 * Date: 2022-08-21 16:13
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 313. 超级丑数
 */

public class P0313 {
    // code beginning
    class Solution {
        public int nthSuperUglyNumber(int n, int[] primes) {
            TreeSet<Long> set = new TreeSet<>();
            set.add(1L);
            for (int i = 1; i <= n; i++) {
                long x = set.pollFirst();
                if (i == n) return (int) x;
                for (int prime : primes) {
                    set.add(prime * x);
                    if (x % prime == 0) break;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0313().new Solution();
        Object ans = s.nthSuperUglyNumber(12, new int[]{2, 7, 13, 19});
        System.out.println(ans);
    }
}