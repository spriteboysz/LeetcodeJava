package leetcode.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-08-19 22:23
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 496. 下一个更大元素 I
 */

public class P0496 {
    // code beginning
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums2.length; i++) map.put(nums2[i], i);
            int[] next = new int[nums1.length];
            for (int i = 0; i < nums1.length; i++) {
                boolean flag = false;
                for (int j = map.get(nums1[i]) + 1; j < nums2.length; j++) {
                    if (nums2[j] > nums1[i]) {
                        flag = true;
                        next[i] = nums2[j];
                        break;
                    }
                }
                if (!flag) next[i] = -1;
            }
            return next;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0496().new Solution();
        int[] ans = s.nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(ans));
    }
}