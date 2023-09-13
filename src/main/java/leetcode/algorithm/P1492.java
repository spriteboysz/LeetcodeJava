package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-13 21:41
 * FileName: src/main/java/leetcode/algorithm
 * Description:1492. n 的第 k 个因子
 */

public class P1492 {
    // code beginning
    class Solution {
        public int kthFactor(int n, int k) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    k--;
                }
                if (k == 0) return i;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1492().new Solution();
        var ans = s.kthFactor(12, 3);
        System.out.println(ans);
    }
}
