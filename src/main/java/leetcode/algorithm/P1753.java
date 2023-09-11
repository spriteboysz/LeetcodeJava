package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-11 23:35
 * FileName: src/leetcode/common
 * Description:1753. 移除石子的最大得分
 */

public class P1753 {
    // code beginning
    class Solution {
        public int maximumScore(int a, int b, int c) {
            int sum = a + b + c;
            int maximum = Math.max(a, Math.max(b, c));
            return Math.min(sum - maximum, sum / 2);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1753().new Solution();
        var ans = s.maximumScore(2, 4, 6);
        System.out.println(ans);
    }
}
