package leetcode.editor.cn.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-08 23:19
 * LastEditTime: 2022-07-08 23:19
 * Description: 922. 按奇偶排序数组 II
 */

public class P0922 {
    // code beginning
    class Solution {
        public int[] sortArrayByParityII(int[] nums) {
            int[] sortArray = new int[nums.length];
            int even = 0, odd = 1;
            for (int num : nums) {
                if (num % 2 == 0) {
                    sortArray[even] = num;
                    even += 2;
                }
                if (num % 2 != 0) {
                    sortArray[odd] = num;
                    odd += 2;
                }
            }
            return sortArray;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0922().new Solution();
        int[] ans = s.sortArrayByParityII(new int[]{4, 2, 5, 7});
        System.out.println(Arrays.toString(ans));
    }
}