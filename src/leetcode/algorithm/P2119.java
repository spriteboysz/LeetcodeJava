package leetcode.algorithm;

/**
 * Author: @Deean
 * Date: 2022-06-24 22:37
 * LastEditTime: 2022-06-24 22:37
 * Description: .
 */

public class P2119 {
    // code beginning
    class Solution {
        public boolean isSameAfterReversals(int num) {
            return num % 10 != 0 || num == 0;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2119().new Solution();
        Object ans = s.isSameAfterReversals(2119);
        System.out.println(ans);
    }
}