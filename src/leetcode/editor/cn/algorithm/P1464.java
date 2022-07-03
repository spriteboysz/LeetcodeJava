package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-03 22:08
 * LastEditTime: 2022-07-03 22:08
 * Description: 1464. 数组中两元素的最大乘积
 */

public class P1464 {
    // code beginning
    class Solution {
        public int maxProduct(int[] nums) {
            int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
            for (int num : nums) {
                if (num > max2) {
                    if (num > max1) {
                        max2 = max1;
                        max1 = num;
                    } else {
                        max2 = num;
                    }
                }
            }
            return (max1 - 1) * (max2 - 1);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1464().new Solution();
        Object ans = s.maxProduct(new int[]{1, 5, 4, 5});
        System.out.println(ans);
    }
}