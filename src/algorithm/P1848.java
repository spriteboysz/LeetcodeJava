package algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-08-14 22:19
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1848. 到目标元素的最小距离
 */

public class P1848 {
    // code beginning
    class Solution {
        public int getMinDistance(int[] nums, int target, int start) {
            Set<Integer> index = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) index.add(i);
            }
            int min = Integer.MAX_VALUE;
            for (int i : index) {
                min = Math.min(min, Math.abs(i - start));
            }
            return min;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1848().new Solution();
        Object ans = s.getMinDistance(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 1, 0);
        System.out.println(ans);
    }
}