package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-03 22:07
 * FileName: src/leetcode/algorithm
 * Description:2652. 倍数求和
 */

public class P2652 {
    // code beginning
    class Solution {
        public int sumOfMultiples(int n) {
            int sum = 0;
            for (int i = 3; i <= n; i++) {
                if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                    sum += i;
                }
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2652().new Solution();
        Object ans = s.sumOfMultiples(7);
        System.out.println(ans);
    }
}
