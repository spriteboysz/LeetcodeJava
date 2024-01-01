package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2024-01-01 11:19
 * FileName: src/main/java/leetcode/algorithm
 * Description: 2908. 元素和最小的山形三元组 I
 */

public class P2908 {
    // code beginning
    class Solution {
        public int minimumSum(int[] nums) {
            int minimum = Integer.MAX_VALUE;
            boolean flag = false;
            for (int i = 0, n = nums.length; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    for (int k = j + 1; k < n; k++) {
                        if (nums[i] < nums[j] && nums[k] < nums[j]) {
                            minimum = Math.min(minimum, nums[i] + nums[j] + nums[k]);
                            flag = true;
                        }
                    }
                }
            }
            return flag ? minimum : -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2908().new Solution();
        var ans = s.minimumSum(new int[]{5, 4, 8, 7, 10, 2});
        System.out.println(ans);
    }
}
