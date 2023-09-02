package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-11 23:48
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 1523. 在区间范围内统计奇数数目
 */

public class P1523 {
    // code beginning
    class Solution {
        public int countOdds(int low, int high) {
            return (high + 1) / 2 - low / 2;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1523().new Solution();
        Object ans = s.countOdds(3, 7);
        System.out.println(ans);
    }
}