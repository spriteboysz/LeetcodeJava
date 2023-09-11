package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-15 22:27
 * LastEditTime: 2022-07-15 22:27
 * Description: 977. 有序数组的平方
 */

public class P0977 {
    // code beginning
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int[] squares = new int[nums.length];
            int left = 0, right = nums.length - 1, index = 0;
            while (left <= right) {
                if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                    squares[index++] = nums[left] * nums[left];
                    left++;
                } else {
                    squares[index++] = nums[right] * nums[right];
                    right--;
                }
            }
            for (int i = 0; i < nums.length / 2; i++) {
                int tmp = squares[i];
                squares[i] = squares[squares.length - 1 - i];
                squares[squares.length - 1 - i] = tmp;
            }
            return squares;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0977().new Solution();
        int[] ans = s.sortedSquares(new int[]{-7, -3, 2, 3, 11, 12});
        System.out.println(Arrays.toString(ans));
    }
}