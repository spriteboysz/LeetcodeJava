package leetcode.editor.cn.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-29 22:46
 * LastEditTime: 2022-07-29 22:46
 * Description: 34. 在排序数组中查找元素的第一个和最后一个位置
 */

public class P0034 {
    // code beginning
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int start = -1, end = -1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    end = i;
                    if (start == -1) start = i;
                }
                if (nums[i] > target) break;
            }
            return new int[]{start, end};
        }
    }

    public static void main(String[] args) {
        Solution s = new P0034().new Solution();
        int[] ans = s.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6);
        System.out.println(Arrays.toString(ans));
        ans = s.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 7);
        System.out.println(Arrays.toString(ans));
    }
}