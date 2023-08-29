package algorithm;

/**
 * Author: Deean
 * Date: 2023-08-29 18:27
 * FileName: src/algorithm
 * Description:2815. 数组中的最大数对和
 */

public class P2815 {
    // code beginning
    class Solution {
        public int maxSum(int[] nums) {
            int[] digits = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                int max = 0, num = nums[i];
                while (num > 0) {
                    max = Math.max(max, num % 10);
                    num /= 10;
                }
                digits[i] = max;
            }

            int maximum = -1;
            for (int i = 0, n = nums.length; i < n; i++) {
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
        Solution s = new P2815().new Solution();
        Object ans = s.maxSum(new int[]{51, 71, 17, 24, 42});
        System.out.println(ans);
    }
}
