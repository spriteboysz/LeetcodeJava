package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-03 22:14
 * FileName: src/leetcode/algorithm
 * Description:2644. 找出可整除性得分最大的整数
 */

public class P2644 {
    // code beginning
    class Solution {
        public int maxDivScore(int[] nums, int[] divisors) {
            int maximum = Integer.MIN_VALUE, maxCount = 0;
            for (int divisor : divisors) {
                int cnt = 0;
                for (int num : nums) {
                    if (num % divisor == 0) {
                        cnt++;
                    }

                }
                if (cnt > maxCount) {
                    maxCount = cnt;
                    maximum = divisor;
                } else if (cnt == maxCount && maximum > divisor) {
                    maximum = divisor;
                }
            }
            return maximum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2644().new Solution();
        Object ans = s.maxDivScore(new int[]{20, 14, 21, 10}, new int[]{5, 7, 5});
        System.out.println(ans);
    }
}
