package leetcode.editor.cn.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-03 16:48
 * LastEditTime: 2022-07-03 16:48
 * Description: 561. 数组拆分 I
 */

public class P0561 {
    // code beginning
    class Solution {
        public int arrayPairSum(int[] nums) {
            Arrays.sort(nums);
            int sum = 0;
            for (int i = 0; i < nums.length; i += 2) {
                sum += nums[i];
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0561().new Solution();
        Object ans = s.arrayPairSum(new int[]{6, 2, 6, 5, 1, 2});
        System.out.println(ans);
    }
}