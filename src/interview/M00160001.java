package interview;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-17 13:50
 * LastEditTime: 2022-07-17 13:50
 * Description: 面试题 16.01. 交换数字
 */

public class M00160001 {
    // code beginning
    class Solution {
        public int[] swapNumbers(int[] numbers) {
            return new int[]{numbers[1], numbers[0]};
        }
    }

    public static void main(String[] args) {
        Solution s = new M00160001().new Solution();
        int[] ans = s.swapNumbers(new int[]{1, 2});
        System.out.println(Arrays.toString(ans));
    }
}