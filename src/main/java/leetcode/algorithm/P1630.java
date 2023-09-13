package leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-12 23:42
 * FileName: src/main/java/leetcode/algorithm
 * Description:1630. 等差子数组
 */

public class P1630 {
    // code beginning
    class Solution {
        private boolean check(int[] nums, int start, int end) {
            HashSet<Integer> seen = new HashSet<>();
            int maximum = Integer.MIN_VALUE, minimum = Integer.MAX_VALUE, n = end - start + 1;
            for (int i = start; i <= end; i++) {
                seen.add(nums[i]);
                maximum = Math.max(maximum, nums[i]);
                minimum = Math.min(minimum, nums[i]);
            }
            if ((maximum - minimum) % (n - 1) != 0) {
                return false;
            }
            int diff = (maximum - minimum) / (n - 1);
            for (int i = 1; i < n; i++) {
                if (!seen.contains(minimum + (i - 1) * diff)) {
                    return false;
                }
            }
            return true;
        }

        public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
            List<Boolean> arithmetic = new ArrayList<>();
            for (int i = 0; i < l.length; i++) {
                arithmetic.add(check(nums, l[i], r[i]));
            }
            return arithmetic;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1630().new Solution();
        var ans = s.checkArithmeticSubarrays(new int[]{4, 6, 5, 9, 3, 7}, new int[]{0, 0, 2}, new int[]{2, 3, 5});
        System.out.println(ans);
    }
}
