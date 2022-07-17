package leetcode.editor.cn.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-17 16:38
 * LastEditTime: 2022-07-17 16:38
 * Description: 2149. 按符号重排数组
 */

public class P2149 {
    // code beginning
    class Solution {
        public int[] rearrangeArray(int[] nums) {
            int[] positive = new int[nums.length / 2], negative = new int[nums.length / 2];
            int i = 0, j = 0;
            for (int num : nums) {
                if (num > 0) positive[i++] = num;
                if (num < 0) negative[j++] = num;
            }
            int[] rearrange = new int[nums.length];
            for (int k = 0, index = 0; k < nums.length; index++) {
                rearrange[k++] = positive[index];
                rearrange[k++] = negative[index];
            }
            return rearrange;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2149().new Solution();
        int[] ans = s.rearrangeArray(new int[]{3, 1, -2, -5, 2, -4});
        System.out.println(Arrays.toString(ans));
    }
}