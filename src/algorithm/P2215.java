package algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-07-16 23:43
 * LastEditTime: 2022-07-16 23:43
 * Description: 2215. 找出两数组的不同
 */

public class P2215 {
    // code beginning
    class Solution {
        public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>(), set2 = new HashSet<>();
            List<Integer> list1 = new ArrayList<>(), list2 = new ArrayList<>();
            List<List<Integer>> diff = new ArrayList<>();
            for (int num : nums1) set1.add(num);
            for (int num : nums2) set2.add(num);
            for (int num : set1) {
                if (!set2.contains(num)) list1.add(num);
            }
            diff.add(list1);
            for (int num : set2) {
                if (!set1.contains(num)) list2.add(num);
            }
            diff.add(list2);
            return diff;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2215().new Solution();
        Object ans = s.findDifference(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2});
        System.out.println(ans);
    }
}