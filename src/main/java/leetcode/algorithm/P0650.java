package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-16 08:59
 * FileName: src/main/java/leetcode/algorithm
 * Description:650. 只有两个键的键盘
 */

public class P0650 {
    // code beginning
    class Solution {
        public int minSteps(int n) {
            int cnt = 0;
            for (int i = 2; i * i <= n; i++) {
                while (n % i == 0) {
                    cnt += i;
                    n /= i;
                }
            }
            if (n != 1) cnt += n;
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0650().new Solution();
        var ans = s.minSteps(3);
        System.out.println(ans);
    }
}
