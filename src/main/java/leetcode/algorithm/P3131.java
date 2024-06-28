package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2024-06-28 22:58
 * FileName: src/main/java/leetcode/algorithm
 * Description: 3131. 找出与数组相加的整数 I
 */

public class P3131 {
    // code beginning
    class Solution {
        public int addedInteger(int[] nums1, int[] nums2) {
            int max1 = nums1[0], max2 = nums2[0];
            for (int i = 0; i < nums1.length; i++) {
                max1 = Math.max(max1, nums1[i]);
                max2 = Math.max(max2, nums2[i]);
            }
            return max2 - max1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P3131().new Solution();
        var ans = s.addedInteger(new int[]{2, 6, 4}, new int[]{9, 7, 5});
        System.out.println(ans);
    }
}
