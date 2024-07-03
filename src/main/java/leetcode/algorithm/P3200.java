package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2024-07-03 22:10
 * FileName: src/main/java/leetcode/algorithm
 * Description: 3200. 三角形的最大高度
 */

public class P3200 {
    // code beginning
    class Solution {
        public int maxHeightOfTriangle(int red, int blue) {
            return Math.max(calc(red, blue), calc(blue, red));
        }

        private int calc(int n, int m) {
            int odd = (int) Math.sqrt(n);
            int even = (int) ((Math.sqrt(m * 4 + 1) - 1) / 2);
            return odd > even ? even * 2 + 1 : odd * 2;
        }
    }

    public static void main(String[] args) {
        Solution s = new P3200().new Solution();
        var ans = s.maxHeightOfTriangle(2, 4);
        System.out.println(ans);
    }
}
