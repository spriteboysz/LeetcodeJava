package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-03 20:54
 * FileName: src/leetcode/algorithm
 * Description:2656. K 个元素的最大和
 */

public class P2656 {
    // code beginning
    class Solution {
        public int maximizeSum(int[] nums, int k) {
            int maximum = nums[0];
            for (int num : nums) {
                maximum = Math.max(maximum, num);
            }
            return (maximum + maximum + k - 1) * k / 2;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2656().new Solution();
        Object ans = s.maximizeSum(new int[]{1, 2, 3, 4, 5}, 3);
        System.out.println(ans);
    }
}
