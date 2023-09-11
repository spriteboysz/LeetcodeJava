package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-02-26 12:57
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 2520. 统计能整除数字的位数
 */

public class P2520 {
    // code beginning
    class Solution {
        public int countDigits(int num) {
            int cnt = 0, res = num;
            while (num > 0) {
                int digit = num % 10;
                num /= 10;
                if (res % digit == 0) {
                    cnt++;
                }
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2520().new Solution();
        Object ans = s.countDigits(121);
        System.out.println(ans);
    }
}
