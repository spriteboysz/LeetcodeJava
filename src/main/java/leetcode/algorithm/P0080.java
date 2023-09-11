package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-02 23:55
 * LastEditTime: 2022-08-02 23:55
 * Description: 80. 删除有序数组中的重复项 II
 */

public class P0080 {
    // code beginning
    class Solution {
        public int removeDuplicates(int[] nums) {
            int len = 0;
            for (int num : nums) {
                if (len < 2 || nums[len - 2] != num) nums[len++] = num;
            }
            return len;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0080().new Solution();
        Object ans = s.removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3});
        System.out.println(ans);
    }
}