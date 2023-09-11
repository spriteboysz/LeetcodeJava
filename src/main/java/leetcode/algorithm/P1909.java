package leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-10 17:35
 * FileName: src/leetcode/algorithm
 * Description:1909. 删除一个元素使数组严格递增
 */

public class P1909 {
    // code beginning
    class Solution {
        private boolean check(int[] nums) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i - 1] >= nums[i]) {
                    return false;
                }
            }
            return true;
        }

        public boolean canBeIncreasing(int[] nums) {
            for (int i = 0, n = nums.length; i < n; i++) {
                List<Integer> numbers = new ArrayList<>();
                for (int num : nums) {
                    numbers.add(num);
                }
                numbers.remove(i);
                int[] nums1 = new int[n - 1];
                for (int j = 0; j < n - 1; j++) {
                    nums1[j] = numbers.get(j);
                }
                if (check(nums1)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1909().new Solution();
        var ans = s.canBeIncreasing(new int[]{1, 2, 10, 5, 7});
        System.out.println(ans);
    }
}
