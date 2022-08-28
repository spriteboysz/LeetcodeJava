package leetcode.editor.cn.sword;

import java.util.TreeSet;

/**
 * Author: Deean
 * Date: 2022-08-28 16:29
 * FileName: src/leetcode/editor/cn/sword
 * Description: 剑指 Offer II 057. 值和下标之差都在给定的范围内
 */

public class OII0057 {
    // code beginning
    class Solution {
        public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
            TreeSet<Long> set = new TreeSet<>();
            for (int i = 0; i < nums.length; i++) {
                long u = nums[i];
                Long l = set.floor(u), r = set.ceiling(u);
                if (l != null && u - l <= t) return true;
                if (r != null && r - u <= t) return true;
                set.add(u);
                if (i >= k) set.remove((long) nums[i - k]);
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0057().new Solution();
        Object ans = s.containsNearbyAlmostDuplicate(new int[]{1, 0, 1, 1}, 1, 2);
        System.out.println(ans);
    }
}