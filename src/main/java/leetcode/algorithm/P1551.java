package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-17 14:04
 * LastEditTime: 2022-07-17 14:04
 * Description: 1551. 使数组中所有元素相等的最小操作数
 */

public class P1551 {
    // code beginning
    class Solution {
        public int minOperations(int n) {
            int count = 0;
            for (int i = 1; i <= n; i += 2) {
                count += (n - i);
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1551().new Solution();
        Object ans = s.minOperations(6);
        System.out.println(ans);
    }
}