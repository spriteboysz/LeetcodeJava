package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-08-30 21:18
 * FileName: src/leetcode.common
 * Description:2778. 特殊元素平方和
 */

public class P2778 {
    // code beginning
    class Solution {
        public int sumOfSquares(int[] nums) {
            int sum = 0;
            for (int i = 0, n = nums.length; i < n; i++) {
                if (n % (i + 1) == 0) {
                    sum += nums[i] * nums[i];
                }
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2778().new Solution();
        Object ans = s.sumOfSquares(new int[]{2, 7, 1, 19, 18, 3});
        System.out.println(ans);
    }
}
