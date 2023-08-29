package algorithm;

/**
 * Author: @Deean
 * Date: 2022-06-23 23:48
 * LastEditTime: 2022-06-23 23:48
 * Description: 完美数
 */

public class P0507 {
    // code beginning
    class Solution {
        public boolean checkPerfectNumber(int num) {
            if (num == 1) return false;
            int sum = 1;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    sum += i + num / i;
                }
            }
            return sum == num;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0507().new Solution();
        Object ans = s.checkPerfectNumber(28);
        System.out.println(ans);
    }
}