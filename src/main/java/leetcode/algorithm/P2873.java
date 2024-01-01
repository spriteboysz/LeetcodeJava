package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2024-01-01 11:48
 * FileName: src/main/java/leetcode/algorithm
 * Description: 2873. 有序三元组中的最大值 I
 */

public class P2873 {
    // code beginning
    class Solution {
        public long maximumTripletValue(int[] nums) {
            long maximum = 0;
            for (int i = 0, n = nums.length; i < n; ++i) {
                for (int j = i + 1; j < n; ++j) {
                    for (int k = j + 1; k < n; ++k) {
                        long rec = (long) (nums[i] - nums[j]) * nums[k];
                        maximum = Math.max(maximum, rec);
                    }
                }
            }
            return maximum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2873().new Solution();
        var ans = s.maximumTripletValue(new int[]{12, 6, 1, 2, 7});
        System.out.println(ans);
    }
}
