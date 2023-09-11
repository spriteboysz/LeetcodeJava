package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-01 22:44
 * LastEditTime: 2022-07-01 22:44
 * Description: 1342. 将数字变成 0 的操作次数
 */

public class P1342 {
    // code beginning
    class Solution {
        public int numberOfSteps(int num) {
            int count = 0;
            while (num > 0) {
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num -= 1;
                }
                count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1342().new Solution();
        Object ans = s.numberOfSteps(123);
        System.out.println(ans); // 12
    }
}