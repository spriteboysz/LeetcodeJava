package leetcode.interview;

/**
 * Author: Deean
 * Date: 2022-07-12 23:20
 * LastEditTime: 2022-07-12 23:20
 * Description: 面试题 17.04. 消失的数字
 */

public class M00170004 {
    // code beginning
    class Solution {
        public int missingNumber(int[] nums) {
            int sum = 0, n = nums.length;
            for (int num : nums) {
                sum += num;
            }
            return (n + 1) * n / 2 - sum;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00170004().new Solution();
        Object ans = s.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1});
        System.out.println(ans);
    }
}