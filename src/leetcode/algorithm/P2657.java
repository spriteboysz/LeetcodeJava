package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-03 20:45
 * FileName: src/leetcode/algorithm
 * Description:2657. 找到两个数组的前缀公共数组
 */

public class P2657 {
    // code beginning
    class Solution {
        public int[] findThePrefixCommonArray(int[] nums1, int[] nums2) {
            int n = nums1.length;
            int[] digits = new int[n + 1], common = new int[n];
            for (int i = 0; i < n; i++) {
                digits[nums1[i]] += 1;
                digits[nums2[i]] += 1;
                int cnt = 0;
                for (int j = 0; j <= n; j++) {
                    if (digits[j] == 2) {
                        cnt++;
                    }
                }
                common[i] = cnt;
            }
            return common;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2657().new Solution();
        Object ans = s.findThePrefixCommonArray(new int[]{1, 3, 2, 4}, new int[]{3, 1, 2, 4});
        System.out.println(Arrays.toString((int[]) ans));
    }
}
