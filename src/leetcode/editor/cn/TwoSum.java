package leetcode.editor.cn;

import java.util.Arrays;

public class TwoSum {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int n = nums.length;
            for (int i = 0; i < n; ++i) {
                for (int j = i + 1; j < n; ++j) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[0];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
        int[] ans = solution.twoSum(new int[]{1,2,3,4,5}, 5);
        System.out.println(Arrays.toString(ans));
    }
}