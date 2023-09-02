package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-02-26 16:16
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 2460. 对数组执行操作
 */

public class P2460 {
    // code beginning
    class Solution {
        public int[] applyOperations(int[] nums) {
            int i = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != 0) {
                    if (j < nums.length - 1 && nums[j] == nums[j + 1]) {
                        nums[j + 1] = 0;
                        nums[j] *= 2;
                    }
                    nums[i] = nums[j];
                    i++;
                }
            }
            while (i < nums.length) {
                nums[i] = 0;
                i++;
            }
            return nums;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2460().new Solution();
        Object ans = s.applyOperations(new int[]{1, 2, 2, 1, 1, 0});
        System.out.println(ans);
    }
}
