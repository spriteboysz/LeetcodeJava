package leetcode.LCP;

/**
 * Author: Deean
 * Date: 2023-09-30 21:23
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 128. 库存管理 I
 */

public class LCR0128 {
    // code beginning
    class Solution {
        public int stockManagement(int[] stock) {
            int minimum = Integer.MAX_VALUE;
            for (int num : stock) {
                minimum = Math.min(minimum, num);
            }
            return minimum;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0128().new Solution();
        var ans = s.stockManagement(new int[]{4, 5, 8, 3, 4});
        System.out.println(ans);
    }
}
