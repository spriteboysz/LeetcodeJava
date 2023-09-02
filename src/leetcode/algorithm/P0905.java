package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-08 23:04
 * LastEditTime: 2022-07-08 23:04
 * Description: 905. 按奇偶排序数组
 */

public class P0905 {
    // code beginning
    class Solution {
        public int[] sortArrayByParity(int[] nums) {
            int[] sortArray = new int[nums.length];
            int index = 0;
            for (int num : nums) {
                if (num % 2 == 0) sortArray[index++] = num;
            }
            for (int num : nums) {
                if (num % 2 != 0) sortArray[index++] = num;
            }
            return sortArray;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0905().new Solution();
        int[] ans = s.sortArrayByParity(new int[]{3, 1, 2, 4});
        System.out.println(Arrays.toString(ans));
    }
}