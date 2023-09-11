package leetcode.interview;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-23 22:04
 * LastEditTime: 2022-07-23 22:04
 * Description: 面试题 10.11. 峰与谷
 */

public class M00100011 {
    // code beginning
    class Solution {
        public void wiggleSort(int[] nums) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 1; i += 2) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
            // System.out.println(Arrays.toString(nums));
        }
    }

    public static void main(String[] args) {
        Solution s = new M00100011().new Solution();
        s.wiggleSort(new int[]{5, 3, 1, 2, 3});
        System.out.println("SUCCESS");
    }
}