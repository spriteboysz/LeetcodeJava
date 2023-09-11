package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-09 23:55
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 283. 移动零
 */

public class P0283 {
    // code beginning
    class Solution {
        public void moveZeroes(int[] nums) {
            int left = 0, right = 0;
            while (right < nums.length) {
                if (nums[right] != 0) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left++;
                }
                right++;
            }
            System.out.println(Arrays.toString(nums));
        }
    }

    public static void main(String[] args) {
        Solution s = new P0283().new Solution();
        s.moveZeroes(new int[]{0, 1, 0, 3, 12});
    }
}