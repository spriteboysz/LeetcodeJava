package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-06-25 22:55
 * LastEditTime: 2022-06-25 22:55
 * Description: .
 */

public class P0374 {
    // code beginning
    class GuessGame {
        public int guess(int num) {
            if (num > 0) {
                return -1;
            }
            return 0;
        }
    }

    class Solution extends GuessGame {
        public int guessNumber(int n) {
            int left = 1, right = n;
            while (left < right) {
                int mid = left + (right - left) / 2;
                int out = guess(mid);
                if (out == 0) {
                    return mid;
                } else if (guess(mid) < 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return left;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0374().new Solution();
        Object ans = s.guessNumber(10);
        System.out.println(ans);
    }
}