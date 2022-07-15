package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-15 21:43
 * LastEditTime: 2022-07-15 21:43
 * Description: 1518. 换酒问题
 */

public class P1518 {
    // code beginning
    class Solution {
        public int numWaterBottles(int numBottles, int numExchange) {
            int count = numBottles;
            while (numBottles >= numExchange) {
                int cur = numBottles / numExchange;
                numBottles = numBottles % numExchange + cur;
                count += cur;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1518().new Solution();
        Object ans = s.numWaterBottles(15, 4);  // 19
        System.out.println(ans);
        ans = s.numWaterBottles(5, 5);  // 6
        System.out.println(ans);
        ans = s.numWaterBottles(2, 3);  // 2
        System.out.println(ans);
    }
}