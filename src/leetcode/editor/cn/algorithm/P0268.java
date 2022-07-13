package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-13 22:43
 * LastEditTime: 2022-07-13 22:43
 * Description: 268. 丢失的数字
 */

public class P0268 {
    // code beginning
    class Solution {
        public int missingNumber(int[] nums) {
            int sum = 0, n = nums.length;
            for (int num : nums) {
                sum += num;
            }
            return (n + 1) * n / 2 - sum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0268().new Solution();
        Object ans = s.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1});
        System.out.println(ans);
    }
}