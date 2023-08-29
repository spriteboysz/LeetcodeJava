package sword;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-20 23:48
 * LastEditTime: 2022-07-20 23:48
 * Description: 剑指 Offer II 076. 数组中的第 k 大的数字
 */

public class OII0076 {
    // code beginning
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            Arrays.sort(nums);
            return nums[nums.length - k];
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0076().new Solution();
        Object ans = s.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4);
        System.out.println(ans);
    }
}