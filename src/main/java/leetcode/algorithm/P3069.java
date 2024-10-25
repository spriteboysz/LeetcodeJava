package leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2024-06-29 22:24
 * FileName: src/main/java/leetcode/algorithm
 * Description:
 */

public class P3069 {
    // code beginning
    class Solution {
        public int[] resultArray(int[] nums) {
            ArrayList<Integer> nums1 = new ArrayList<>();
            ArrayList<Integer> nums2 = new ArrayList<>();
            nums1.add(nums[0]);
            nums2.add(nums[1]);
            for (int i = 2; i < nums.length; i++) {
                if (nums1.get(nums1.size() - 1) > nums2.get(nums2.size() - 1)) {
                    nums1.add(nums[i]);
                } else {
                    nums2.add(nums[i]);
                }
            }
            nums1.addAll(nums2);
            for (int i = 0; i < nums1.size(); i++) {
                nums[i] = nums1.get(i);
            }
            return nums;
        }
    }

    public static void main(String[] args) {
        Solution s = new P3069().new Solution();
        var ans = s.resultArray(new int[]{5, 4, 3, 8});
        System.out.println(Arrays.toString(ans));
    }
}
