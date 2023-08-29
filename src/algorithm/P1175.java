package algorithm;

/**
 * Author: Deean
 * Date: 2022-08-11 21:33
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1175. 质数排列
 */

public class P1175 {
    // code beginning
    class Solution {
        int mod = 1000000007;

        public int numPrimeArrangements(int n) {
            int count = 0;
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) count++;
            }
            return (int) (factorial(count) * factorial(n - count) % mod);
        }

        private long factorial(int n) {
            long product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
                product %= mod;
            }
            return product;
        }

        private boolean isPrime(int n) {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1175().new Solution();
        Object ans = s.numPrimeArrangements(100);
        System.out.println(ans);
    }
}