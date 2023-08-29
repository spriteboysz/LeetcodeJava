package sword;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-03 21:29
 * LastEditTime: 2022-07-03 21:29
 * Description: 剑指 Offer 17. 打印从1到最大的n位数
 */

public class O0017 {
    // code beginning
    class Solution {
        public int[] printNumbers(int n) {
            int len = (int) Math.pow(10, n) - 1;
            int[] numbers = new int[len];
            for (int i = 0; i < len; i++) {
                numbers[i] = i + 1;
            }
            return numbers;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0017().new Solution();
        int[] ans = s.printNumbers(2);
        System.out.println(Arrays.toString(ans));
    }
}