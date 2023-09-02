package leetcode.algorithm;

import java.util.TreeSet;

/**
 * Author: Deean
 * Date: 2022-08-28 16:14
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 220. 存在重复元素 III
 */

public class P0220 {
    // code beginning
    class Solution {
        public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
            TreeSet<Long> treeSet = new TreeSet<>();
            for (int i = 0; i < nums.length; i++) {
                long u = nums[i];
                Long l = treeSet.floor(u), r = treeSet.ceiling(u);
                if (l != null && u - l <= t) return true;
                if (r != null && r - u <= t) return true;
                treeSet.add(u);
                if (i >= k) treeSet.remove((long) nums[i - k]);
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0220().new Solution();
        Object ans = s.containsNearbyAlmostDuplicate(new int[]{1, 0, 1, 1}, 1, 2);
        System.out.println(ans);
    }
}