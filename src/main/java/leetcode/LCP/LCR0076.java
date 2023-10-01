package leetcode.LCP;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-30 15:31
 * FileName: src/main/java/leetcode/algorithm
 * Description:LCR 076. 数组中的第 K 个最大元素
 */

public class LCR0076 {
    // code beginning
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            Arrays.sort(nums);
            return nums[nums.length - k];
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0076().new Solution();
        var ans = s.findKthLargest(new int[]{3,2,1,5,6,4}, 2);
        System.out.println(ans);
    }
}
