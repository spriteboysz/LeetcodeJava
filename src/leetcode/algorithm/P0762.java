package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-09 23:07
 * LastEditTime: 2022-07-09 23:07
 * Description: 762. 二进制表示中质数个计算置位
 */

public class P0762 {
    // code beginning
    class Solution {
        public int countPrimeSetBits(int left, int right) {
            int count = 0;
            for (int i = left; i <= right; i++) {
                if (isPrime(Integer.bitCount(i))) {
                    count++;
                }
            }
            return count;
        }

        private boolean isPrime(int bitCount) {
            if (bitCount < 2) return false;
            for (int i = 2; i * i <= bitCount; i++) {
                if (bitCount % i == 0) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0762().new Solution();
        Object ans = s.countPrimeSetBits(10, 15);  // 5, [10, 11, 12, 13, 14]
        System.out.println(ans);
    }
}