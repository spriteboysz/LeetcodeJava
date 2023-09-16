package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-16 14:14
 * FileName: src/main/java/leetcode/algorithm
 * Description:343. 整数拆分
 */

public class P0343 {
    // code beginning
    class Solution {
        public int integerBreak(int n) {
            if (n <= 3) return n - 1;
            int a = n / 3, b = n % 3;
            if (b == 0) {
                return (int) Math.pow(3, a);
            }
            if (b == 1) {
                return (int) Math.pow(3, a - 1) * 4;
            }
            return (int) Math.pow(3, a) * 2;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0343().new Solution();
        var ans = s.integerBreak(10);
        System.out.println(ans);
    }
}
