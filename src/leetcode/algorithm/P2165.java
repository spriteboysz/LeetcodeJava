package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-10 09:32
 * FileName: src/leetcode/algorithm
 * Description:
 */

public class P2165 {
    // code beginning
    class Solution {
        private long getMax(int[] digits) {
            long num = 0;
            for (int i = 9; i >= 0; i--) {
                while (digits[i] > 0) {
                    num *= 10;
                    num += i;
                    digits[i]--;
                }
            }
            return num;
        }

        private long getMin(int[] digits) {
            long num = 0;
            for (int i = 1; i < 10; i++) {
                if (digits[i] > 0) {
                    num += i;
                    digits[i]--;
                    break;
                }
            }
            for (int i = 0; i < 10; i++) {
                while (digits[i] > 0) {
                    num *= 10;
                    num += i;
                    digits[i]--;
                }
            }
            return num;
        }

        public long smallestNumber(long num) {
            boolean negative = num < 0;
            num = Math.abs(num);
            int[] digits = new int[10];
            while (num > 0) {
                digits[(int) (num % 10)]++;
                num /= 10;
            }
            return negative ? -1 * getMax(digits) : getMin(digits);
        }
    }

    public static void main(String[] args) {
        Solution s = new P2165().new Solution();
        var ans = s.smallestNumber(310);
        System.out.println(ans);
        System.out.println(s.smallestNumber(-7605));
    }
}
