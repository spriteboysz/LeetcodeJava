package leetcode.editor.cn.sword;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-17 00:12
 * LastEditTime: 2022-07-17 00:12
 * Description: 剑指 Offer II 006. 排序数组中两个数字之和
 */

public class OII0006 {
    // code beginning
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            for (int i = 0; i < numbers.length; i++) {
                int index = Arrays.binarySearch(Arrays.copyOfRange(numbers, i + 1, numbers.length), target - numbers[i]);
                if (index >= 0) {
                    return new int[]{i, index};
                }
            }
            return new int[0];
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0006().new Solution();
        int[] ans = s.twoSum(new int[]{2, 3, 4}, 6);
        System.out.println(Arrays.toString(ans));
        ans = s.twoSum(new int[]{2, 3, 5}, 6);
        System.out.println(Arrays.toString(ans));
    }
}