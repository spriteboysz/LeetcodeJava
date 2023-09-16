package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-16 14:04
 * FileName: src/main/java/leetcode/algorithm
 * Description:357. 统计各位数字都不同的数字个数
 */

public class P0357 {
    // code beginning
    class Solution {
        public int countNumbersWithUniqueDigits(int n) {
            if (n == 0) return 1;
            if (n == 1) return 10;
            int cnt = 10, cur = 9;
            for (int i = 0; i < n - 1; i++) {
                cur *= 9 - i;
                cnt += cur;
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0357().new Solution();
        var ans = s.countNumbersWithUniqueDigits(2);
        System.out.println(ans);
    }
}
