package leetcode.algorithm;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Author: Deean
 * Date: 2023-12-30 19:35
 * FileName: src/main/java/leetcode/algorithm
 * Description: 2956. 找到两个数组中的公共元素
 */

public class P2956 {
    // code beginning
    class Solution {
        public int[] findIntersectionValues(int[] nums1, int[] nums2) {
            HashSet<Integer> set1 = new HashSet<>();
            HashSet<Integer> set2 = new HashSet<>();
            for (int num : nums1) {
                set1.add(num);
            }
            for (int num : nums2) {
                set2.add(num);
            }
            int m = 0, n = 0;
            for (int num : nums1) {
                if (set2.contains(num)) {
                    m++;
                }
            }
            for (int num : nums2) {
                if (set1.contains(num)) {
                    n++;
                }
            }
            return new int[]{m, n};
        }
    }

    public static void main(String[] args) {
        Solution s = new P2956().new Solution();
        var ans = s.findIntersectionValues(new int[]{4, 3, 2, 3, 1}, new int[]{2, 2, 5, 2, 3, 6});
        System.out.println(Arrays.toString(ans));
    }
}
