package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-06 22:13
 * FileName: src/leetcode/algorithm
 * Description:2605. 从两个数字数组里生成最小数字
 */

public class P2605 {
    // code beginning
    class Solution {
        public int minNumber(int[] nums1, int[] nums2) {
            int[] digits = new int[10];
            for (int num : nums1) {
                digits[num] |= 1;
            }
            for (int num : nums2) {
                digits[num] |= 2;
            }
            int a = -1, b = -1;
            for (int i = 1; i <= 9; i++) {
                if (a == -1 && digits[i] == 1) {
                    a = i;
                }
                if (b == -1 && digits[i] == 2) {
                    b = i;
                }
                if (digits[i] == 3) {
                    return i;
                }
            }
            return Math.min(10 * a + b, 10 * b + a);
        }
    }

    public static void main(String[] args) {
        Solution s = new P2605().new Solution();
        Object ans = s.minNumber(new int[]{3, 5, 2, 6}, new int[]{3, 1, 7});
        System.out.println(ans);
    }
}
