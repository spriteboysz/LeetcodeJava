package algorithm;

/**
 * Author: Deean
 * Date: 2022-08-28 20:23
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1227. 飞机座位分配概率
 */

public class P1227 {
    // code beginning
    class Solution {
        public double nthPersonGetsNthSeat(int n) {
            return n == 1 ? 1.0 : 0.5;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1227().new Solution();
        Object ans = s.nthPersonGetsNthSeat(2);
        System.out.println(ans);
    }
}