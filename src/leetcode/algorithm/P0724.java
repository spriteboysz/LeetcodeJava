package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-16 23:47
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 724. 寻找数组的中心下标
 */

public class P0724 {
    // code beginning
    class Solution {
        public int pivotIndex(int[] nums) {
            int total = 0, sum = 0;
            for (int num : nums) total += num;
            for (int i = 0; i < nums.length; i++) {
                if (sum * 2 + nums[i] == total) return i;
                sum += nums[i];
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0724().new Solution();
        Object ans = s.pivotIndex(new int[]{2, 1, -1});
        System.out.println(ans);
        ans = s.pivotIndex(new int[]{1, 2, 3});
        System.out.println(ans);
    }
}