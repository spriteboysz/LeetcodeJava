package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2023-02-26 11:17
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2540. 最小公共值
 */

public class P2540 {
    // code beginning
    class Solution {
        public int getCommon(int[] nums1, int[] nums2) {
            for (int i = 0, j = 0; i < nums1.length && j < nums2.length; ) {
                if (nums1[i] < nums2[j]) {
                    i++;
                } else if (nums1[i] > nums2[j]) {
                    j++;
                } else {
                    return nums1[i];
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2540().new Solution();
        Object ans = s.getCommon(new int[]{1, 2, 3}, new int[]{2, 4});
        System.out.println(ans);
    }
}
