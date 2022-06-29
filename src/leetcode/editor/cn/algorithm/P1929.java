package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-06-29 22:17
 * LastEditTime: 2022-06-29 22:17
 * Description: 1929. 数组串联
 */

public class P1929 {
    // code beginning
    class Solution {
        public int[] getConcatenation(int[] nums) {
            int[] concatenation = new int[2 * nums.length];
            for (int i = 0; i < nums.length; i++) {
                concatenation[i] = nums[i];
                concatenation[nums.length + i] = nums[i];
            }
            return concatenation;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1929().new Solution();
        Object ans = s.getConcatenation(new int[]{1, 3, 2, 1});
        System.out.println(ans);
    }
}