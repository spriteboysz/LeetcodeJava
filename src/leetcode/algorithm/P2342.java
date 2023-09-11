package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-09 21:22
 * FileName: src/leetcode/algorithm
 * Description:2342. 数位和相等数对的最大和
 */

public class P2342 {
    // code beginning
    class Solution {
        private int process(int num) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            return sum;
        }

        public int maximumSum(int[] nums) {
            int n = nums.length;
            int[] digits = new int[nums.length];
            for (int i = 0; i < n; i++) {
                digits[i] = process(nums[i]);
            }
            int maximum = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (digits[i] == digits[j]) {
                        maximum = Math.max(maximum, nums[i] + nums[j]);
                    }
                }
            }
            return maximum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2342().new Solution();
        var ans = s.maximumSum(new int[]{18, 43, 36, 13, 7});
        System.out.println(ans);
    }
}
