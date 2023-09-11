package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-06-30 23:21
 * LastEditTime: 2022-06-30 23:21
 * Description: 1470. 重新排列数组
 */

public class P1470 {
    // code beginning
    class Solution {
        public int[] shuffle(int[] nums, int n) {
            int[] shuffle = new int[nums.length];
            for (int i = 0, j = 0; j < nums.length; i++) {
                shuffle[j++] = nums[i];
                shuffle[j++] = nums[i + n];
            }
            return shuffle;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1470().new Solution();
        int[] ans = s.shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4);
        System.out.println(Arrays.toString(ans));
    }
}