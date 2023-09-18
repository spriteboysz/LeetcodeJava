package leetcode.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-16 20:27
 * FileName: src/main/java/leetcode/algorithm
 * Description:4. 寻找两个正序数组的中位数
 */

public class P0004 {
    // code beginning
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            List<Integer> nums = new ArrayList<>();
            for (int num : nums1) {
                nums.add(num);
            }
            for (int num : nums2) {
                nums.add(num);
            }
            Collections.sort(nums);
            int n = nums.size();
            return n % 2 == 0 ? (nums.get(n / 2 - 1) + nums.get(n / 2)) / 2.0 : nums.get(n / 2);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0004().new Solution();
        var ans = s.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});
        System.out.println(ans);
    }
}
