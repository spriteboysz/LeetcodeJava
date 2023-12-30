package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-12-30 20:18
 * FileName: src/main/java/leetcode/algorithm
 * Description: 2932. 找出强数对的最大异或值 I
 */

public class P2932 {
    // code beginning
    class Solution {
        public int maximumStrongPairXor(int[] nums) {
            int maximum = 0;
            for (int num1 : nums) {
                for (int num2 : nums) {
                    if (Math.abs(num1 - num2) <= Math.min(num1, num2)) {
                        maximum = Math.max(maximum, num1 ^ num2);
                    }
                }
            }
            return maximum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2932().new Solution();
        var ans = s.maximumStrongPairXor(new int[]{1, 2, 3, 4, 5});
        System.out.println(ans);
    }
}
