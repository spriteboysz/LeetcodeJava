package leetcode.sword;

/**
 * Author: Deean
 * Date: 2022-07-17 13:20
 * LastEditTime: 2022-07-17 13:20
 * Description: 剑指 Offer 64. 求1+2+…+n
 */

public class O0064 {
    // code beginning
    class Solution {
        public int sumNums(int n) {
            return n * (n + 1) / 2;
        }
    }

    public static void main(String[] args) {
        Solution s = new O0064().new Solution();
        Object ans = s.sumNums(9);
        System.out.println(ans);
    }
}