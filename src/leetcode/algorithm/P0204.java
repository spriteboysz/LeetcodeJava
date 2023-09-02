package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-27 23:48
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 204. 计数质数
 */

public class P0204 {
    // code beginning
    class Solution {
        public int countPrimes(int n) {
            int[] isPrime = new int[n];
            Arrays.fill(isPrime, 1);
            int count = 0;
            for (int i = 2; i < n; ++i) {
                if (isPrime[i] == 0) continue;
                count += 1;
                if ((long) i * i < n) {
                    for (int j = i * i; j < n; j += i) {
                        isPrime[j] = 0;
                    }
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0204().new Solution();
        Object ans = s.countPrimes(100);
        System.out.println(ans);
    }
}