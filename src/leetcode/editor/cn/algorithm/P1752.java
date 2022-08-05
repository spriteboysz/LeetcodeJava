package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-05 23:54
 * Description: 1752. 检查数组是否经排序和轮转得到
 */

public class P1752 {
    // code beginning
    class Solution {
        public boolean check(int[] nums) {
            int count = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i - 1]) {
                    count++;
                    if (count > 1) return false;
                }
            }
            return count == 0 || nums[nums.length - 1] <= nums[0];
        }
    }

    public static void main(String[] args) {
        Solution s = new P1752().new Solution();
        Object ans = s.check(new int[]{2, 1, 3, 4});
        System.out.println(ans);
    }
}