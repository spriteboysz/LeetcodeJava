package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-03 21:36
 * LastEditTime: 2022-07-03 21:36
 * Description: 1827. 最少操作使数组递增
 */

public class P1827 {
    // code beginning
    class Solution {
        public int minOperations(int[] nums) {
            if (nums.length == 1) return 0;
            int count = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] <= nums[i - 1]) {
                    count += nums[i - 1] - nums[i] + 1;
                    nums[i] = nums[i - 1] + 1;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1827().new Solution();
        Object ans = s.minOperations(new int[]{1, 5, 2, 4, 1});
        System.out.println(ans);
        ans = s.minOperations(new int[]{8});
        System.out.println(ans);
    }
}