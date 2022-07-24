package leetcode.editor.cn.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-24 23:59
 * LastEditTime: 2022-07-24 23:59
 * Description: 88. 合并两个有序数组
 */

public class P0088 {
    // code beginning
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            for (int i = 0; i != n; ++i) {
                nums1[m + i] = nums2[i];
            }
            Arrays.sort(nums1);
            // System.out.println(Arrays.toString(nums1));
        }
    }

    public static void main(String[] args) {
        Solution s = new P0088().new Solution();
        s.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
        System.out.println("SUCCESS");
    }
}