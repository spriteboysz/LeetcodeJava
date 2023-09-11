package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-10 11:40
 * FileName: src/leetcode/algorithm
 * Description:2091. 从数组中移除最大值和最小值
 */

public class P2091 {
    // code beginning
    class Solution {
        public int minimumDeletions(int[] nums) {
            int maximum = Integer.MIN_VALUE, minimum = Integer.MAX_VALUE, n = nums.length;
            int index1 = -1, index2 = -1;
            for (int i = 0; i < n; i++) {
                if (nums[i] > maximum) {
                    maximum = nums[i];
                    index1 = i;
                }
                if (nums[i] < minimum) {
                    minimum = nums[i];
                    index2 = i;
                }
            }
            int a = Math.max(index1, index2) + 1;
            int b = n - Math.min(index1, index2);
            int c = n - Math.max(index1, index2) + Math.min(index1, index2) + 1;
            return Math.min(c, Math.min(a, b));
        }
    }

    public static void main(String[] args) {
        Solution s = new P2091().new Solution();
        var ans = s.minimumDeletions(new int[]{2, 10, 7, 5, 4, 1, 8, 6});
        System.out.println(ans);
    }
}
