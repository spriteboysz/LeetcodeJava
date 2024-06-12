package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2024-06-12 22:57
 * FileName: src/main/java/leetcode/algorithm
 * Description:
 */

public class P3099 {
    // code beginning
    class Solution {
        public int sumOfTheDigitsOfHarshadNumber(int x) {
            int sum = 0, num = x;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (x % sum == 0) {
                return sum;
            } else {
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P3099().new Solution();
        var ans = s.sumOfTheDigitsOfHarshadNumber(18);
        System.out.println(ans);
    }
}
