package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-01 21:05
 * FileName: src/leetcode.common
 * Description:2739. 总行驶距离
 */

public class P2739 {
    // code beginning
    class Solution {
        public int distanceTraveled(int mainTank, int additionalTank) {
            return (mainTank + Math.min((mainTank - 1) >> 2, additionalTank)) * 10;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2739().new Solution();
        Object ans = s.distanceTraveled(5, 10);
        System.out.println(ans);
    }
}
