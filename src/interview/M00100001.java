package interview;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-08-06 23:24
 * Description: 面试题 10.01. 合并排序的数组
 */

public class M00100001 {
    // code beginning
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            if (n >= 0) System.arraycopy(nums2, 0, nums1, m, n);
            Arrays.sort(nums1);
            System.out.println(Arrays.toString(nums1));
        }
    }

    public static void main(String[] args) {
        Solution s = new M00100001().new Solution();
        s.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 6, 5}, 3);
    }
}