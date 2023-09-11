package leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-04 23:33
 * FileName: src/leetcode/algorithm
 * Description:2614. 对角线上的质数
 */

public class P2614 {
    // code beginning
    class Solution {
        public List<Integer> prime = new ArrayList<>();

        private boolean check(int num) {
            if (prime.contains(num)) {
                return true;
            }
            if (num <= 1) return false;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            prime.add(num);
            return true;
        }

        public int diagonalPrime(int[][] nums) {
            int maximum = 0;
            for (int i = 0, n = nums.length; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((i == j || i == n - 1 - j) && check(nums[i][j])) {
                        maximum = Math.max(maximum, nums[i][j]);
                    }
                }
            }
            return maximum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2614().new Solution();
        Object ans = s.diagonalPrime(new int[][]{{17, 2, 3}, {5, 6, 7}, {9, 10, 11}});
        System.out.println(ans);
    }
}
