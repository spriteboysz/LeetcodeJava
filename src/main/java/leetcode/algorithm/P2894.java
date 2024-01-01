package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-12-31 22:33
 * FileName: src/main/java/leetcode/algorithm
 * Description: 2894. 分类求和并作差
 */

public class P2894 {
    // code beginning
    class Solution {
        public int differenceOfSums(int n, int m) {
            int num1 = -1, num2 = -1;
            for (int i = 1; i <= n; i++) {
                if (i % m == 0) {
                    num2 += i;
                } else {
                    num1 += i;
                }
            }
            return num1 - num2;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2894().new Solution();
        var ans = s.differenceOfSums(10, 3);
        System.out.println(ans);
    }
}
