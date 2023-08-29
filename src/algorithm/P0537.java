package algorithm;

/**
 * Author: Deean
 * Date: 2022-07-17 21:21
 * LastEditTime: 2022-07-17 21:21
 * Description: 537. 复数乘法
 */

public class P0537 {
    // code beginning
    class Solution {
        public String complexNumberMultiply(String num1, String num2) {
            String[] complex1 = num1.split("\\+|i");
            String[] complex2 = num2.split("\\+|i");
            int real1 = Integer.parseInt(complex1[0]), imag1 = Integer.parseInt(complex1[1]);
            int real2 = Integer.parseInt(complex2[0]), imag2 = Integer.parseInt(complex2[1]);
            return String.format("%d+%di", real1 * real2 - imag1 * imag2, real1 * imag2 + imag1 * real2);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0537().new Solution();
        Object ans = s.complexNumberMultiply("1+-1i", "1+-1i");
        System.out.println(ans);
    }
}