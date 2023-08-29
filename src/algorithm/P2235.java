package algorithm;

/**
 * Author: Deean
 * Date: 2022-06-29 22:10
 * LastEditTime: 2022-06-29 22:10
 * Description: 2235. 两整数相加
 */

public class P2235 {
    // code beginning
    class Solution {
        public int sum(int num1, int num2) {
            return num1 + num2;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2235().new Solution();
        Object ans = s.sum(12, 5);
        System.out.println(ans);
    }
}