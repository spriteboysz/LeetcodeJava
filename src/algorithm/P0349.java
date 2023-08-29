package algorithm;

import java.util.*;

/**
 * Author: Deean
 * Date: 2022-07-06 23:48
 * LastEditTime: 2022-07-06 23:48
 * Description: 349. 两个数组的交集
 */

public class P0349 {
    // code beginning
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>(), set2 = new HashSet<>();
            for (int num : nums1) set1.add(num);
            for (int num : nums2) set2.add(num);

            List<Integer> list = new ArrayList<>();
            for (int num : set1) {
                if (set2.contains(num)) list.add(num);
            }

            int[] ans = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                ans[i] = list.get(i);
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0349().new Solution();
        int[] ans = s.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
        System.out.println(Arrays.toString(ans));
    }
}